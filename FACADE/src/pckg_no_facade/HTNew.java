package pckg_no_facade;

public class HTNew {

    private Facade facade;

    public HTNew(Facade facade) {
        this.facade = facade;
    }

    public void watchMovie(){
        facade.watchMovie();
    }

    public void stopWatchingMovie(){
        facade.stopWatching();
    }
}
