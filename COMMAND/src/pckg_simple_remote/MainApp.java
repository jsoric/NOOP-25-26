package pckg_simple_remote;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {
        RemoteController simpleRC = new RemoteController();
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        simpleRC.setCommand(new GarageDoorCmd(garageDoor));
        simpleRC.remoteControllerBtnPressed();
        Thread.sleep(3000);
        simpleRC.remoteControllerBtnPressed();
        simpleRC.setCommand(new LightCmd(light));
        Thread.sleep(3000);
        simpleRC.remoteControllerBtnPressed();
        Thread.sleep(3000);
        simpleRC.remoteControllerBtnPressed();
    }
}
