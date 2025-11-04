package pckg_payment;

public class PaymentModule {

    private PaymentStrategy paymentStrategy;

    public PaymentModule() {
        System.out.println("Some payment module...");
    }

    public PaymentModule(PaymentStrategy paymentStrategy) {
        System.out.println("Some payment module...");
        this.paymentStrategy = paymentStrategy;
    }

    public void performPayment(double amount) {
        paymentStrategy.performPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
