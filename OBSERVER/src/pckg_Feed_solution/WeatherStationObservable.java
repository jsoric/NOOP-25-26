package pckg_Feed_solution;

public interface WeatherStationObservable {

    void register(ObserverWS observerWS);
    void remove(ObserverWS observerWS);
    void notifyAllRegisteredObservers();
}
