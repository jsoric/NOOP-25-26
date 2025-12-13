package abstract_method_factory;

import pckg_simple_factory.Car;
import pckg_simple_factory.CarType;

public class TestApp {

    public static void main(String[] args) {

        CarStore euCarStore = new EuCarStore();
        CarStore ukCarStore = new UkCarStore();

        Car UKSedan = ukCarStore.orderCar(CarType.SEDAN,"M3", "Bmw");
        Car EuSedan = euCarStore.orderCar(CarType.SEDAN,"Cls63", "Mercedes");

        Car EuSuv = euCarStore.orderCar(CarType.SUV,"XM", "Bmw");
        System.out.println("EuSedan = " + EuSedan);
        System.out.println("UKSedan = " + UKSedan);
        System.out.println("EuSuv = " + EuSuv);
    }
}
