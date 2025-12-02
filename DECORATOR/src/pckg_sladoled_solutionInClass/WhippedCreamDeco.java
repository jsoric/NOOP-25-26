package pckg_sladoled_solutionInClass;

public class WhippedCreamDeco extends IceCreamDecorator {

    public WhippedCreamDeco(IceCream decoIceCream) {
        super(decoIceCream);
    }

    @Override
    public void getDescription() {
        decoIceCream.getDescription();
        System.out.println("Decorated with whipped cream!");
    }

    @Override
    public double getPrice() {
        return decoIceCream.getPrice() + this.unitPriceDeco;
    }

    @Override
    public String toString() {
        return "WhippedCreamDeco{" +
                "decoIceCream=" + decoIceCream +
                ", unitPriceDeco=" + unitPriceDeco +
                '}';
    }
}
