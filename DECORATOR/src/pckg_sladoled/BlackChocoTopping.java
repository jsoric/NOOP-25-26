package pckg_sladoled;

public class BlackChocoTopping extends IceCreamDecorator{

    private double totalPrice;

    protected BlackChocoTopping(int amount, double price, AbsSladoled sladoled) {
        super(amount, price, sladoled);
    }

    @Override
    protected double calculateTotalPrice() {
        totalPrice = sladoled.calculateTotalPrice() + amount * price;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "BlackChocoTopping{" +
                "sladoled=" + this.sladoled +
                ", price=" + totalPrice +
                '}';
    }
}
