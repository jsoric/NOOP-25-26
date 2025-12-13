package abs_factory;

public class Test {
    public static void main(String[] args) {
        WordEditApp wp = new WordEditApp(new MACGUIFactory());
        wp.createGUI();
        System.out.println(wp);
        WordEditApp wp2 = new WordEditApp(new WINGUIFact());
        wp2.createGUI();
        System.out.println(wp2);

    }
}
