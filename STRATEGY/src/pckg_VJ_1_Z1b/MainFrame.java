package pckg_VJ_1_Z1b;

import pckg_VJ_1_Z1b.calculationStrategies.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;

    public MainFrame() {

        super("Calculator");
        setSize(600, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();

    }

    private void initComps() {
        inputPanel = new InputPanel();
        presentationPanel = new PresentationPanel();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);
    }

    private void activateMainFrame() {

        inputPanel.setInputPanelListener(new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(InputPanelData ipd) {
                try {
                    CalculationStrategy calculationStrategy = resolveAlgOperation(ipd.getAlgOperation());
                    double result = calculationStrategy.performCalculation(ipd.getFstNum(), ipd.getSndNum());
                    if (ipd.getAlgOperation().equals(ALG_OPERATION.DIVISION) && ipd.getSndNum() == 0) {
                        presentationPanel.setResult("ERROR - Division by zero!");
                    } else {
                        presentationPanel.setResult(String.valueOf(result));
                        presentationPanel.addResultToAll(ipd.getFstNum() + " " + ipd.getAlgOperation() + " " + ipd.getSndNum() + " = " + result);
                    }

                } catch (NullPointerException npe) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Please select a calculating operation!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private CalculationStrategy resolveAlgOperation(ALG_OPERATION alg_operation){
        switch(alg_operation.toString()){
            case "Addition": return new AdditionStrategy();
            case "Subtraction": return new SubtractionStrategy();
            case "Multiplication": return new MultiplicationStrategy();
            case "Division": return new DivisionStrategy();
            default: throw new NullPointerException();
        }
    }
}
