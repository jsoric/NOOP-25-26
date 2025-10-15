package pckg_interface_parametrization;

public class StringLengthComparison implements Comparable<StringLengthComparison>{


    private final String initString;


    public StringLengthComparison(String initString) {
        this.initString = initString;
    }

    @Override
    public int compareTo(StringLengthComparison other) {
        return initString.length() - other.initString.length();
    }
}
