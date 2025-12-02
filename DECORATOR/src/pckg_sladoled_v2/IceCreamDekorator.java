package pckg_sladoled_v2;

public class IceCreamDekorator extends Sladoled {

    protected static final double PRICE = 1.0;

    protected IceCreamDekorator(int amount) {
        super(amount);
    }

    protected IceCreamDekorator(int amount, Sladoled sladoled) {
        super(amount, sladoled);
    }

    public double calculatePrice() {
        totalPrice = amount*PRICE;
        return totalPrice;
    }
}
