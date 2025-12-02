package pckg_sladoled;

public class ChocolateFlavorIceCream extends AbsSladoled {

    private double totalPrice;
    protected ChocolateFlavorIceCream(int amount, double price) {
        super(amount, price);
    }

    protected ChocolateFlavorIceCream(int amount, double price, AbsSladoled sladoled) {
        super(amount, price);
        this.sladoled = sladoled;
    }

    @Override
    protected double calculateTotalPrice() {
        if(sladoled != null) {
            totalPrice =  sladoled.calculateTotalPrice() + amount*price;
        } else {
            totalPrice =  amount*price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ChocolateFlavorIceCream{" +
                "price=" + amount*price +
                '}';
    }
}
