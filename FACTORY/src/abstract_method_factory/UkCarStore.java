package abstract_method_factory;

import pckg_simple_factory.Car;
import pckg_simple_factory.CarType;

public class UkCarStore extends CarStore{
    @Override
    public Car createCar(CarType carType, String model, String manufacturer) {
        Car car = null;
        if(carType.equals(CarType.SUV)){
            car = new UKSuv(manufacturer, model);
        }
        if(carType.equals(CarType.SEDAN)){
            car = new UKSedan(manufacturer, model);
        }

        return car;
    }
}
