class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        status = PaymentStatus.SUCCESS;
    }
}

class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment...");
        status = PaymentStatus.SUCCESS;
    }
}

class PaymentFactory {
    public static Payment getPaymentMethod(String type, double amount) {
        switch (type) {
            case "CreditCard": return new CreditCardPayment(amount);
            case "UPI": return new UpiPayment(amount);
            default: throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}
