package pckg_Event_solution;

public class MobileWeatherAppNew implements GenObserver<WeatherSensorReadings> {
    @Override
    public void update(WeatherSensorReadings event) {
        System.out.println("Mobile App: " + this);
        System.out.println(event.temp());
        System.out.println(event.pressure());
        System.out.println(event.humidity());
        System.out.println(event.atTime());
        System.out.println(event);
        System.out.println("------------------------------------------------------");
    }
}
