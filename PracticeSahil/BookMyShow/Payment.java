enum PaymentStatus {
    SUCCESS, FAILURE, PENDING
}

abstract class Payment {
    protected double amount;
    protected PaymentStatus status;

    public Payment(double amount) {
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    public abstract void processPayment();
}
