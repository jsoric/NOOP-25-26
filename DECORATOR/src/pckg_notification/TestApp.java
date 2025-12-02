package pckg_notification;

public class TestApp {

    public static void main(String[] args) {
        BaseNotifier baseNotifier = new BaseNotifier();
        Notifier notifierCompound = new SMSNotifierDecorator(new SlackNotifierDecorator(baseNotifier));
        notifierCompound.sendMessage("Hello World");
        baseNotifier.sendMessage("Hello World");

    }
}
