package pckg_fst_app;

public interface Observable {

    void add(ObserverInt ob);
    void remove(ObserverInt ob);
    void notifyAllObservers();
}
