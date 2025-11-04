package pckg_Feed_solution;

public class MobileWSAppFeeds implements ObserverWS {

    private WeatherFeed weatherFeed;

    @Override
    public void setFeedData(WeatherFeed feed) {
        this.weatherFeed = feed;
    }

    @Override
    public void updateData() {
        System.out.println("Mobile app: " + this);
        System.out.println("Temperature: " + weatherFeed.getTemperature());
        System.out.println("Pressure: " + weatherFeed.getPressure());
        System.out.println("Humidity: " + weatherFeed.getHumidity());
        System.out.println("--------------------------------------------------");
    }
}
