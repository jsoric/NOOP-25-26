package pckg_sladoled_solutionInClass;

import java.util.ArrayList;
import java.util.List;

public class IceCreamApp {

    private final List<IceCream> iceCreamList;

    public IceCreamApp() {
        this.iceCreamList = new ArrayList<>();
    }

    public void addIceCream(IceCream iceCream) {
        this.iceCreamList.add(iceCream);
        System.out.println(iceCream + " added to a bill list");
    }

    public void finishOrder() {
        double totalPrice = 0.0;
        System.out.println("========================== Order ==========================");
        for (IceCream iceCream : iceCreamList) {
            System.out.println(iceCream);
            totalPrice += iceCream.getPrice();
        }
        System.out.println("Total price: " + totalPrice + "€");
    }
}
