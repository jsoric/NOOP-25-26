package pckg_VJ_1_Z1b;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextField resultField;
    private JTextArea resultArea;
    private JScrollPane resultsScrollPane;

    public PresentationPanel() {
        Dimension dims = getPreferredSize();
        dims.width = 300;
        setPreferredSize(dims);

        initComps();
        layoutComps();
    }

    private void initComps() {
        resultField = new JTextField(15);
        resultArea = new JTextArea(10, 15);
        resultsScrollPane = new JScrollPane(resultArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        resultField.setEditable(false);
        resultArea.setEditable(false);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result: "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(resultField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("All results: "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(resultsScrollPane, gbc);
    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void addResultToAll(String result) {
        resultArea.append(result + "\n");

    }
}
