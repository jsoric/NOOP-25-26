package pckg_VJ_1_Z1b;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class InputPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JComboBox<ALG_OPERATION> algOperationCombo;
    private JButton calculateBtn;
    private InputPanelListener inputPanelListener;

    public InputPanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Input calculator");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        Dimension dims = getPreferredSize();
        dims.width = 300;
        setPreferredSize(dims);

        initComps();
        layoutComps();
        activatePanel();
    }

    private void initComps() {
        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        algOperationCombo = new JComboBox<ALG_OPERATION>();
        DefaultComboBoxModel<ALG_OPERATION> comboBoxModel = new DefaultComboBoxModel<>();
        for(ALG_OPERATION op : ALG_OPERATION.values()) {
            comboBoxModel.addElement(op);
        }
        algOperationCombo.setModel(comboBoxModel);
        algOperationCombo.setSelectedIndex(-1);
        calculateBtn = new JButton("Calculate");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("1st number: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(fstNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("2nd number: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(sndNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Choose math operation: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(algOperationCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(calculateBtn, gbc);

    }

    private void activatePanel() {
        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Double fstNum = Double.parseDouble(fstNumField.getText());
                    Double sndNum = Double.parseDouble(sndNumField.getText());
                    ALG_OPERATION algOp = (ALG_OPERATION) algOperationCombo.getSelectedItem();
                    InputPanelData inputPanelData = new InputPanelData(fstNum, sndNum, algOp);
                    if(inputPanelListener != null) {
                        inputPanelListener.inputPanelEventOccurred(inputPanelData);
                    } else {
                        JOptionPane.showMessageDialog(InputPanel.this, "Input Panel Listener not set", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(InputPanel.this, nfe.getMessage(), "Exception", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public void setInputPanelListener(InputPanelListener inputPanelListener) {
        this.inputPanelListener = inputPanelListener;
    }
}
