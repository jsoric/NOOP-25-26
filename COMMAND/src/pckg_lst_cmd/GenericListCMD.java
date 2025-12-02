package pckg_lst_cmd;

import java.util.List;

public class GenericListCMD<E> implements Cmd{

    List<E> someList;

    public GenericListCMD(List <E> someList) {
        this.someList = someList;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
