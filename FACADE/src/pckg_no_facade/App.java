package pckg_no_facade;

public class App {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        Player player = new Player();

        HomeTheatre homeTheatre = new HomeTheatre(amplifier, player, lights, screen, projector);

        homeTheatre.turnOnProjector();
        homeTheatre.turnOnPlayer();
        homeTheatre.turnOnAmplifier();
        homeTheatre.pullDownScreen();
        homeTheatre.turnLightsOff();
        //some time after
        homeTheatre.turnLightsOn();
        homeTheatre.turnOffPlayer();
        homeTheatre.turnOffAmplifier();
        homeTheatre.pullUpScreen();
        homeTheatre.turnOffProjector();

        HTNew newTheatre = new HTNew(new Facade(amplifier, player, lights, screen, projector));
        newTheatre.watchMovie();
        newTheatre.stopWatchingMovie();
    }
}
