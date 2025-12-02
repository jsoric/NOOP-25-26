package pckg_sladoled_v2;

public class Test {

    public static void main(String[] args) {
        ChocolateIceCream c = new ChocolateIceCream(1, new VanillaIceCream(2, new StrawberryIceCream(1)));
        System.out.println(c);

    }
}
