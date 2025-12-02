package pckg_no_facade;

public class HomeTheatre {

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;

    public HomeTheatre(Amplifier amp, Player player, Lights lights, Screen scr, Projector proj) {
        this.amplifier = amp;
        this.player = player;
        this.lights = lights;
        this.screen = scr;
        this.projector = proj;
    }

    public void turnLightsOn(){
        lights.turnOnLights();
    }

    public void turnLightsOff(){
        lights.turnOffLights();
    }

    public void turnOnPlayer(){
        player.turnOnPlayer();
    }

    public void turnOffPlayer(){
        player.turnOffPlayer();
    }

    public void turnOnAmplifier(){
        amplifier.turnOnAmp();
    }

    public void turnOffAmplifier(){
        amplifier.turnOffAmp();
    }

    public void pullUpScreen(){
        screen.pullUpScreen();
    }

    public void pullDownScreen(){
        screen.pullDownScreen();
    }

    public void turnOnProjector(){
        projector.turnOnProjector();
    }

    public void turnOffProjector(){
        projector.turnOffProjector();
    }
}
