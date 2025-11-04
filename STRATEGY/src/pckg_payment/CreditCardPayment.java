package pckg_payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void performPayment(double amount) {
        System.out.println("Credit card payment in the amount of $" + amount);
    }
}
