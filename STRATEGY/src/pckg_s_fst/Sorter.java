package pckg_s_fst;

import java.util.List;

public abstract class Sorter<E> {

    protected List<E> lst;
    protected SortPrinciple sortPrinciple;

    protected Sorter(List<E> lst, SortPrinciple sortPrinciple) {
        this.lst = lst;
        this.sortPrinciple = sortPrinciple;
    }

    protected void setListToSort(List<E> lst) {
        this.lst = lst;
    }
    protected abstract void performSorting();

    public void setSortPrinciple(SortPrinciple sortPrinciple) {
        this.sortPrinciple = sortPrinciple;
    }
}
