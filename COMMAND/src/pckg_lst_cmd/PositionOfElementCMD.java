package pckg_lst_cmd;

import java.util.List;

public class PositionOfElementCMD <E> implements Cmd{

    private List<E> someList;
    private E element;

    public PositionOfElementCMD(List<E> someList, E element) {
        this.someList = someList;
        this.element = element;
    }

    @Override
    public void execute() {
        int pos = someList.indexOf(element);
        System.out.println("Position of element " + element + " at position: " + pos);
    }

    @Override
    public void undo() {
        System.out.println("Nothing to undo on this command: " + getClass().getSimpleName());
    }

    @Override
    public void redo() {
        execute();
    }
}
