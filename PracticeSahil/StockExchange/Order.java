
enum OrderType { BUY, SELL; }
class Order {
    private int orderId;
    private OrderType type;
    private double price;
    private int qty;
    private long timestamp;

    public Order(int OrderId, OrderType type, double price, int qty, long timestamp) {
        this.orderId = OrderId;
        this.type = type;
        this.price = price;
        this.qty = qty;
        this.timestamp = timestamp;
    }
}