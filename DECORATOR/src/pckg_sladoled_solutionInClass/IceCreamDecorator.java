package pckg_sladoled_solutionInClass;

public abstract class IceCreamDecorator implements IceCream {

    protected IceCream decoIceCream;
    protected final double unitPriceDeco;

    public IceCreamDecorator(IceCream decoIceCream) {
        this.decoIceCream = decoIceCream;
        this.unitPriceDeco = 0.5;
    }
}
