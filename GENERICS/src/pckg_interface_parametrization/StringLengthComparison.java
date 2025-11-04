package pckg_interface_parametrization;

public class StringLengthComparison implements Comparable<StringLengthComparison> {

    private final String baseString;

    public StringLengthComparison(String baseString) {
        this.baseString = baseString;
    }

    @Override
    public int compareTo(StringLengthComparison other) {
        return this.baseString.length() - other.baseString.length();
    }

    @Override
    public String toString() {
        return baseString;
    }
}
