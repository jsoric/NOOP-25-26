package pckg_s_fst;

import java.util.List;

public class SimpleSorter<E> extends Sorter<E>{

    protected SimpleSorter(List<E> lst, SortPrinciple sortPrinciple) {
        super(lst, sortPrinciple);
    }

    @Override
    protected void performSorting() {
        sortPrinciple.sortElements(lst);
    }
}
