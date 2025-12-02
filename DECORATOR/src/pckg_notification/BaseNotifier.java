package pckg_notification;

public class BaseNotifier implements Notifier {
    @Override
    public void sendMessage(String message) {
        System.out.println("EMAIL: sending msg: " + message);
    }
}
