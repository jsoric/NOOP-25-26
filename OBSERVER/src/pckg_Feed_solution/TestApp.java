package pckg_Feed_solution;

public class TestApp {

    public static void main(String[] args) {
        WSWithFeed wsWithFeed =  new WSWithFeed(15, 1200, 67);
        MobileWSAppFeeds mobileWSAppFeeds1 = new MobileWSAppFeeds();
        MobileWSAppFeeds mobileWSAppFeeds2 = new MobileWSAppFeeds();
        wsWithFeed.register(mobileWSAppFeeds1);
        wsWithFeed.register(mobileWSAppFeeds2);
        wsWithFeed.notifyAllRegisteredObservers();
        wsWithFeed.sensorsDataChanged(9, 1003, 89);
    }

}
