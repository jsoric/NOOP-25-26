package pckg_sladoled;

public abstract class AbsSladoled {

    protected double price;
    protected double amount;
    protected AbsSladoled sladoled;

    protected AbsSladoled(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    protected AbsSladoled(int amount, double price, AbsSladoled sladoled) {
        this(amount, price);
        this.sladoled = sladoled;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    protected abstract double calculateTotalPrice();
}
