package abstract_method_factory;

import pckg_simple_factory.Car;

public class EUSuv extends Car {
    protected EUSuv(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String toString() {
        return "EUSuv{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date=" + date +
                '}';
    }
}
