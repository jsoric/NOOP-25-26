package pckg_Feed_solution;

import pckg_Event_solution.ObservableWS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WSWithFeed implements WeatherStationObservable, WeatherFeed{

    private float temperature;
    private float pressure;
    private float humidity;
    private final List<ObserverWS> observers;

    public WSWithFeed(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        observers = new CopyOnWriteArrayList<>();
    }

    @Override
    public float getTemperature() {
        return this.temperature;
    }

    @Override
    public float getPressure() {
        return this.pressure;
    }

    @Override
    public float getHumidity() {
        return this.humidity;
    }

    @Override
    public void register(ObserverWS observerWS) {
        if(observers.contains(observerWS)) {
            System.out.println("Observer already registered!");
        } else {
            observers.add(observerWS);
            System.out.println("Observer registered!");
        }
    }

    @Override
    public void remove(ObserverWS observerWS) {

    }

    public void sensorsDataChanged(float t, float p, float h) {
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        notifyAllRegisteredObservers();
    }

    @Override
    public void notifyAllRegisteredObservers() {
        for (ObserverWS observerWS : observers) {
            WeatherFeed wf = new WSWithFeed(temperature, pressure, humidity);
            observerWS.setFeedData(wf);
            observerWS.updateData();
        }
    }
}
