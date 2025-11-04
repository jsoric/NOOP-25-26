package pckg_VJ_1_Z1b;

public class InputPanelData {

    private double fstNum;
    private double sndNum;
    private ALG_OPERATION algOperation;

    public InputPanelData(double fstNum, double sndNum, ALG_OPERATION algOperation) {
        this.fstNum = fstNum;
        this.sndNum = sndNum;
        this.algOperation = algOperation;
    }

    public double getFstNum() {
        return fstNum;
    }

    public double getSndNum() {
        return sndNum;
    }

    public ALG_OPERATION getAlgOperation() {
        return algOperation;
    }

    @Override
    public String toString() {
        return "InputPanelData{" +
                "fstNum=" + fstNum +
                ", sndNum=" + sndNum +
                ", algOperation=" + algOperation +
                '}';
    }
}
