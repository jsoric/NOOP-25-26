package pckg_VJ_1_Z1b;

public enum ALG_OPERATION {

    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");

    private String algOperLabel;

    ALG_OPERATION(String algOperLabel) {
        this.algOperLabel = algOperLabel;
    }

    @Override
    public String toString() {
        return algOperLabel;
    }
}
