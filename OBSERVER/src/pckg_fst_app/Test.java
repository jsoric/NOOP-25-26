package pckg_fst_app;

public class Test {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation(23, 1024, 89);
        MobileWeatherApp mwApp1 = new MobileWeatherApp();
        MobileWeatherApp mwApp2 = new MobileWeatherApp();
        ws.add(mwApp1);
        ws.add(mwApp2);
        ws.notifyAllObservers();

    }
}
