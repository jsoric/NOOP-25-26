package pckg_VJ_Z1_bezGUIa.calculationStrats;

public class AdditionStrat implements CalculationStrat {
    @Override
    public void performCalculation(double fstNum, double sndNum) {
        System.out.println("Result is: " + (fstNum + sndNum));
    }
}
