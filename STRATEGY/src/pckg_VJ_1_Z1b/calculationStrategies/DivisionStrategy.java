package pckg_VJ_1_Z1b.calculationStrategies;

import javax.swing.*;

public class DivisionStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fstNum, double sndNum) {
        if(sndNum == 0){
            JOptionPane.showMessageDialog(null, "Division by zero is not possible!", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        } else {
            return fstNum / sndNum;
        }
    }
}
