package pckg_payment;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void performPayment(double amount) {
        System.out.println("PayPal Payment in the amount of $" + amount);
    }
}
