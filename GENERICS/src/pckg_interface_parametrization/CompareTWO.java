package pckg_interface_parametrization;

public class CompareTWO <T extends Comparable<T>> {

    private final T fst;
    private final T snd;

    public CompareTWO(T fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public void performComparison(){
        if(fst.compareTo(snd) > 0){
            System.out.printf("%s is greater than %s\n", fst, snd);
        } else if(fst.compareTo(snd) < 0){
            System.out.printf("%s is greater than %s\n", snd, fst);
        } else {
            System.out.printf("%s is equal to %s\n", fst, snd);
        }
    }
}
