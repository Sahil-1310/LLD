import java.util.PriorityQueue;

class MatchingEngine {
    private final OrderBook orderBook;

    public MatchingEngine(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    public void matchOrders() {
        PriorityQueue<Order> buyOrders = orderBook.getBuyOrders();
        PriorityQueue<Order> sellOrders = orderBook.getSellOrders();

        while(!buyOrders.isEmpty() && !sellOrders.isEmpty()) {
            Order buy = buyOrders.peek();
            Order sell = sellOrders.peek();

            if (buy.getPrice() >= sell.getPrice()) { /* Match Found */
                int tradeQuantity = Math.min(buy.getQuantity(), sell.getQuantity());

                System.out.println("Trade Executed: " + tradeQuantity + " shares at " + sell.getPrice() + " OrderId : " + sell.getOrderId() );

                buy.setQuantity(buy.getQuantity() - tradeQuantity);
                sell.setQuantity(sell.getQuantity() - tradeQuantity);

                if (buy.getQuantity() == 0) buyOrders.poll();
                if (sell.getQuantity() == 0) sellOrders.poll();
            } else {
                break;
            }
        }
    }
}