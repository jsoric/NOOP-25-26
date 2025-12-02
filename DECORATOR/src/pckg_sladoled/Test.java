package pckg_sladoled;

public class Test {

    public static void main(String[] args) {
        ChocolateFlavorIceCream chocolateFlavorIceCream = new ChocolateFlavorIceCream(2, 2);
        BlackChocoTopping iceCream = new BlackChocoTopping(1, 1, chocolateFlavorIceCream);
        iceCream.calculateTotalPrice();
        System.out.println(iceCream);
    }
}
