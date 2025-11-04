package pckg_interface_parametrization;

public class TestComparison {

    public static void main(String[] args) {
        String sFst = "Hello";
        String sSnd = "Novi string koji je puno dug i nema kraja...";
        CompareTWO<String> stringCompareTWO =  new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();
        Integer iFst = 12;
        Integer iSnd = 12;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(iFst, iSnd);
        integerCompareTWO.performComparison();
        StringLengthComparison fst = new StringLengthComparison(sFst);
        StringLengthComparison snd = new StringLengthComparison(sSnd);
        CompareTWO<StringLengthComparison> stringLengthComparisonCompareTWO = new CompareTWO<>(fst, snd);
        stringLengthComparisonCompareTWO.performComparison();

    }
}
