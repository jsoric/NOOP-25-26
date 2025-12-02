package pckg_notification;

public class SlackNotifierDecorator extends NotifierDecorator {

    protected SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message);
        System.out.println("SLACK msg: " + message);
    }
}
