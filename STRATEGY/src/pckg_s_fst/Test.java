package pckg_s_fst;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        SortPrinciple_1 sp1 = new SortPrinciple_1();
        SimpleSorter<String> sp = new SimpleSorter<>(new ArrayList<>(), sp1);
        sp.performSorting();
        SortPrinciple_2 sp2 = new SortPrinciple_2();
        sp.setSortPrinciple(sp2);
        sp.performSorting();
    }
}
