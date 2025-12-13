package abstract_method_factory;

import pckg_simple_factory.Car;

public class UKSuv extends Car {
    protected UKSuv(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String toString() {
        return "UKSuv{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date=" + date +
                '}';
    }
}
