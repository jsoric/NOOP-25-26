package pckg_interface_parametrization;

public class CompareTWO <T extends Comparable<T>>{

    private final T fst;
    private final T snd;
    private final T trd;

    public CompareTWO(T fst, T snd, T trd) {
        this.fst = fst;
        this.snd = snd;
        this.trd = trd;
    }
/*
    public void setFst(T newfst){
        this.fst = newfst;
    }

    --> Kompajler neda jer smo stavil final <--
 */

    public void performComparison(){
        if(fst.compareTo(snd) > 0){
            System.out.println("The first one is greater than second!");
        } else if(fst.compareTo(snd) < 0){
            System.out.println("The second is greater than first!");
        } else {
            System.out.println("They are equal");
        }
    }


}
