package pckg_fst_app;

import java.util.Observer;

public class MobileWeatherApp implements ObserverInt {

    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherStation station;

    public MobileWeatherApp() {
        System.out.println("MobileWeatherApp created!");
    }

    @Override
    public void setWeatherStation(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.temperature = station.getTemp();
        this.pressure = station.getPressure();
        this.humidity = station.getHumidity();
        System.out.println(this + " update data from WS: " + this.station);
        System.out.println("Temperature: " + temperature);
        System.out.println("Pressure: " + pressure);
        System.out.println("Humidity: " + humidity);
        System.out.println("------------------------------------------------------");
    }
}
