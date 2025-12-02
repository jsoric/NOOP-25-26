package pckg_sladoled_solutionInClass;

public class SimpleIceCreamDeco extends IceCreamDecorator{

    protected IceCream sndIceCream;

    public SimpleIceCreamDeco(IceCream decoIceCream, IceCream sndIceCream) {
        super(decoIceCream);
        this.sndIceCream = sndIceCream;
    }

    @Override
    public void getDescription() {
        decoIceCream.getDescription();
        System.out.println("Simple ice cream decorator");
    }

    @Override
    public double getPrice() {
        return decoIceCream.getPrice() + sndIceCream.getPrice();
    }

    @Override
    public String toString() {
        return "SimpleIceCreamDeco{" +
                "sndIceCream=" + sndIceCream +
                ", decoIceCream=" + decoIceCream +
                '}';
    }
}
