package pckg_fst_app;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStation implements Observable{

    private float temp;
    private float pressure;
    private float humidity;
    private final List<ObserverInt> observers;

    public WeatherStation(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.observers = new CopyOnWriteArrayList<>();
        System.out.println("Weather station created!");
        notifyAllObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void add(ObserverInt ob) {
        if(observers.contains(ob)){
            System.out.println("Observer already exists!");
        } else {
            observers.add(ob);
            System.out.println("New observer added!");
            ob. setWeatherStation(this);
        }
    }

    @Override
    public void remove(ObserverInt ob) {

    }

    @Override
    public void notifyAllObservers() {
        for(ObserverInt ob : observers){
            ob.update();
        }
    }

    public void setWeatherStationData(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyAllObservers();
    }
}
