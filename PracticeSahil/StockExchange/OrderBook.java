import java.util.PriorityQueue;

class OrderBook {

    private final PriorityQueue<Order> buyOrders;
    private final PriorityQueue<Order> sellOrders;

    public OrderBook() {
        this.buyOrders = new PriorityQueue<>(
                (o1, o2) -> o2.getPrice() == o1.getPrice() ? o1.compareTo(o2) : Double.compare(o2.getPrice(), o1.getPrice())
        ); // Higher price first (Max Heap)

        this.sellOrders = new PriorityQueue<>(
                (o1, o2) -> o1.getPrice() == o2.getPrice() ? o1.compareTo(o2) : Double.compare(o1.getPrice(), o2.getPrice())
        ); // Lower price first (Min Heap)
    }

    public void addOrder(Order order) {
        if (order.getType() == OrderType.BUY) {
            buyOrders.add(order);
        } else {
            sellOrders.add(order);
        }
    }

    public PriorityQueue<Order> getBuyOrders() { return buyOrders; }
    public PriorityQueue<Order> getSellOrders() { return sellOrders; }
}