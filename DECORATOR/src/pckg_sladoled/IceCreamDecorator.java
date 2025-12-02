package pckg_sladoled;

public abstract class IceCreamDecorator extends AbsSladoled {

    protected AbsSladoled sladoled;


    protected IceCreamDecorator(int amount, double price, AbsSladoled sladoled) {
        super(amount, price);
        this.sladoled = sladoled;
    }
}
