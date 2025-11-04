package pckg_VJ_Z1_bezGUIa.calculationStrats;

public class DivisionStrat implements CalculationStrat {
    @Override
    public void performCalculation(double fstNum, double sndNum) {
        if(sndNum == 0){
            System.out.println("Division with zero is not possible!");
        } else {
            System.out.println("Result is: " + (fstNum / sndNum));
        }
    }
}
