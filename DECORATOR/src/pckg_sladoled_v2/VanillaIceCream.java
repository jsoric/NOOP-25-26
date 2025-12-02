package pckg_sladoled_v2;

public class VanillaIceCream extends DairySladoled {
    protected VanillaIceCream(int amount) {
        super(amount);
    }

    protected VanillaIceCream(int amount, Sladoled sladoled) {
        super(amount, sladoled);
    }
}
