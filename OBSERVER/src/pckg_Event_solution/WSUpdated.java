package pckg_Event_solution;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WSUpdated implements ObservableWS<WeatherSensorReadings>{

    private final List<GenObserver<WeatherSensorReadings>>observers;
    private WeatherSensorReadings wsr;

    public WSUpdated(float temp, float pressure, float humidity) {
        this.observers = new CopyOnWriteArrayList<>();
        this.wsr = new WeatherSensorReadings(temp, pressure, humidity, Instant.now());
    }

    public void setDataFromSensors(float t, float p, float h){
        this.wsr = new WeatherSensorReadings(t, p, h, Instant.now());
    }

    @Override
    public void registerObserver(GenObserver<WeatherSensorReadings> genObs) {
        if(this.observers.contains(genObs)){
            System.out.println("Observer already registered!");
        } else {
            this.observers.add(genObs);
            System.out.println("Observer registered!");
        }
    }

    @Override
    public void removeObserverFromList(GenObserver<WeatherSensorReadings> genObs) {
        if(this.observers.contains(genObs)){
            this.observers.remove(genObs);
        } else {
            System.out.println("Observer not registered!");
        }
    }

    @Override
    public void notifyRegisteredObservers() {
        for(GenObserver<WeatherSensorReadings> genObs : this.observers){
            genObs.update(this.wsr);
        }
    }
}
