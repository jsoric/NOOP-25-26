package pckg_no_facade;

public class Facade {

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;

    public Facade(Amplifier amp, Player player, Lights lights, Screen scr, Projector proj) {
        this.amplifier = amp;
        this.player = player;
        this.lights = lights;
        this.screen = scr;
        this.projector = proj;
    }

    public void watchMovie(){
        amplifier.turnOnAmp();
        player.turnOnPlayer();
        screen.pullDownScreen();
        projector.turnOnProjector();
        lights.turnOffLights();
    }

    public void stopWatching(){
        lights.turnOnLights();
        amplifier.turnOffAmp();
        player.turnOffPlayer();
        screen.pullUpScreen();
        projector.turnOffProjector();

    }

}
