package pckg_simple_factory;

public class CarStore {

    private String carStoreName;

    public CarStore(String carStoreName) {
        this.carStoreName = carStoreName;

    }

    public Car orderCar(CarType carType, String model, String manufacturer) {
       return  SimpleCarCreator.createCar(model, manufacturer, carType);
    }
}
