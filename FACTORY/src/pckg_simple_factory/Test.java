package pckg_simple_factory;

public class Test {
    public static void main(String[] args) {

        CarStore carStore = new CarStore("Best Car selling house!");
        Car car = carStore.orderCar(CarType.SUV, "Rav4", "Toyota");

        System.out.println(car);

        Car sndCar  = carStore.orderCar(CarType.SEDAN, "M4", "Bmw");

        System.out.println(sndCar);
    }
}
