package pckg_payment;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void performPayment(double amount) {
        System.out.println("Crypto payment in the amount of $" + amount);
    }
}
