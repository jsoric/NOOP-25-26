package pckg_sladoled;

public class VanillaFlavorIceCream extends AbsSladoled {

    private double totalPrice;
    protected VanillaFlavorIceCream(int amount, double price) {
        super(amount, price);
    }

    protected VanillaFlavorIceCream(int amount, double price, AbsSladoled sladoled) {
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
        return "VanillaFlavorIceCream{" +
                "price=" + amount*price +
                '}';
    }
}
