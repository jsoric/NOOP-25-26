package pckg_sladoled;

public class WalnutPowder extends IceCreamDecorator{

    private double totalPrice;

    protected WalnutPowder(int amount, double price, AbsSladoled sladoled) {
        super(amount, price, sladoled);
    }

    @Override
    protected double calculateTotalPrice() {
        totalPrice = sladoled.calculateTotalPrice() + amount*price;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "WalnutPowder{" +
                "totalPrice=" + totalPrice +
                ", amount=" + amount +
                ", sladoled=" + sladoled +
                '}';
    }
}
