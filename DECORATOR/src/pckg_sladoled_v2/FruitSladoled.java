package pckg_sladoled_v2;

public abstract class FruitSladoled extends Sladoled {

    protected static final double PRICE = 3.0;

    protected FruitSladoled(int amount) {
        super(amount);
    }

    protected FruitSladoled(int amount, Sladoled sladoled) {
        super(amount, sladoled);
    }

    public double calculatePrice(){
        totalPrice = amount*PRICE;
        return totalPrice;
    }
}
