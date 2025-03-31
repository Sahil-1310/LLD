import java.util.Iterator;

public class StockExchangeApplication {
    public static void main(String[] args) {
        OrderBook orderBook = new OrderBook();
        MatchingEngine engine = new MatchingEngine(orderBook);

        // Sample Orders
        orderBook.addOrder(new Order(OrderType.BUY, 150.0, 10)); // Buy 10 shares @ $150
        orderBook.addOrder(new Order(OrderType.SELL, 149.0, 5));  // Sell 5 shares @ $149
        orderBook.addOrder(new Order(OrderType.SELL, 150.0, 10)); // Sell 10 shares @ $150

        engine.matchOrders();

        Iterator<Order> iterator = orderBook.getSellOrders().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getQuantity() + " ");
        }
    }
}
