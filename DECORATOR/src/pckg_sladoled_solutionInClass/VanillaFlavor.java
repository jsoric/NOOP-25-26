package pckg_sladoled_solutionInClass;

public class VanillaFlavor extends MilkBasedIC {

    public VanillaFlavor() {
        super();
    }

    @Override
    public void getDescription() {
        System.out.println("Vanilla flavor ice cream!");
    }

    @Override
    public double getPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "VanillaFlavor{" +
                "unitPrice=" + unitPrice +
                '}';
    }
}
