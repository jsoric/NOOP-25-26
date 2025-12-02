package pckg_lst_cmd;

import java.util.List;

public class AddElementPosition<E> implements Cmd{

    private List<E> someList;
    private int index;
    private E element;

    public AddElementPosition(List<E> someList, int index, E element) {
        this.someList = someList;
        this.index = index;
        this.element = element;
    }

    @Override
    public void execute() {
        someList.add(index, element);
        System.out.println("Added element: " + element + " at position: " + index);
    }

    @Override
    public void undo() {
        someList.remove(index);
        System.out.println("Removed element at position: " + index);
    }

    @Override
    public void redo() {
        execute();
    }
}
