package pckg_VJ_1_Z1b.calculationStrategies;

public class SubtractionStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fstNum, double sndNum) {
        return fstNum - sndNum;
    }
}
