package pckg_VJ_1_Z1b;

import javax.swing.*;

public class Test {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
