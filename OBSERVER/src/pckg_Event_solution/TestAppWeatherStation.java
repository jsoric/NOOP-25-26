package pckg_Event_solution;

public class TestAppWeatherStation {
    public static void main(String[] args) {
        WSUpdated wsUpdated = new WSUpdated(14, 1200, 77);
        MobileWeatherAppNew mwApp1 = new MobileWeatherAppNew();
        MobileWeatherAppNew mwApp2 = new MobileWeatherAppNew();
        wsUpdated.registerObserver(mwApp1);
        wsUpdated.registerObserver(mwApp2);
        wsUpdated.notifyRegisteredObservers();
    }
}
