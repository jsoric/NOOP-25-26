package pckg_sladoled_v2;

public abstract class Sladoled {

    protected int amount;
    protected Sladoled sladoled;
    protected double totalPrice;

    protected Sladoled(int amount){
        this.amount = amount;
    }

    protected Sladoled(int amount, Sladoled sladoled){
        this(amount);
        this.sladoled = sladoled;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        if(sladoled == null){
            return this.getClass().getSimpleName() + "{" +
                    ", amount=" + amount + '}';
        } else {
            return this.getClass().getSimpleName() + "{" +
                    "amount = " + amount +
                    " sladoled = " + sladoled +  ", totalPrice=" + (totalPrice + sladoled.calculatePrice()) +'}';
        }
    }
}
