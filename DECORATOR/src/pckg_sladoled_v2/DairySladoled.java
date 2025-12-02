package pckg_sladoled_v2;

public abstract class DairySladoled extends Sladoled {

    protected static final double PRICE = 3.0;

    protected DairySladoled(int amount) {
        super(amount);
    }

    protected DairySladoled(int amount, Sladoled sladoled) {
        super(amount, sladoled);
    }

    public double calculatePrice(){
        totalPrice = amount*PRICE;
        return totalPrice;
    }
}
