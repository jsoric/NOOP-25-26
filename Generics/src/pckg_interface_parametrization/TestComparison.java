package pckg_interface_parametrization;

public class TestComparison {

    public static void main(String[] args) {
        String sFst = "Tamo neki string ...";
        String sSnd = "Novi string!";
        CompareTWO<String> stringCompareTWO = new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();

        Integer iFst = 100;
        Integer iSnd = 100;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(iFst, iFst);
        integerCompareTWO.performComparison();
        StringLengthComparison fst = new StringLengthComparison(sFst);
        StringLengthComparison snd = new StringLengthComparison(sSnd);
        CompareTWO<StringLengthComparison> stringLengthComparisonCompareTWO = new CompareTWO<>(fst, snd);
        stringLengthComparisonCompareTWO.performComparison();
    }
}
