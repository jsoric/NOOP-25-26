package pckg_sladoled_solutionInClass;

public class TestApp {

    public static void main(String[] args) {
        IceCreamApp iceCreamApp = new IceCreamApp();
        iceCreamApp.addIceCream(new VanillaFlavor());
        iceCreamApp.addIceCream(new SimpleIceCreamDeco(new VanillaFlavor(), new LemonFlavor()));
        iceCreamApp.finishOrder();
        iceCreamApp.addIceCream(new LemonFlavor());
        iceCreamApp.addIceCream(new BlackChocoSyrupDeco(new WhippedCreamDeco(new VanillaFlavor())));
        iceCreamApp.finishOrder();
    }
}
