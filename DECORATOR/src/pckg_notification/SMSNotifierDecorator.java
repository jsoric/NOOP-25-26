package pckg_notification;

public class SMSNotifierDecorator extends NotifierDecorator {

    protected SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message);
        System.out.println("SMS msg: " + message);
    }
}
