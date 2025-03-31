import java.util.concurrent.atomic.AtomicInteger;

enum OrderType {
    BUY,
    SELL
}

class Order implements Comparable<Order> {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private final int orderId;
    private final OrderType type;
    private final double price;
    private int quantity;
    private final long timestamp;

    public Order(OrderType type, double price, int quantity) {
        this.orderId = idCounter.getAndIncrement();
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.timestamp = System.currentTimeMillis();
    }
    public int getOrderId() { return orderId; }
    public OrderType getType() { return type; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public long getTimestamp() { return timestamp; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public int compareTo(Order other) {
        return Long.compare(this.timestamp, other.timestamp); // FIFO ordering for same price orders
    }
}