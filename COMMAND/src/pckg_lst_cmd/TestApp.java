package pckg_lst_cmd;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        ListManager<String> listManager = new ListManager<>(newList);
        listManager.setCommand(new AddElementCMD<String>(newList, "Tobias"));
        listManager.exeCommand();
        listManager.setCommand(new AddElementCMD<String>(newList, "Renata"));
        listManager.exeCommand();
        listManager.listAllElementsInList();
        listManager.setCommand(new AddElementPosition<String>(newList, 1, "Sonia"));
        listManager.exeCommand();
        listManager.listAllElementsInList();
        listManager.undoCmd();
        listManager.listAllElementsInList();
        listManager.redoCmd();
        listManager.listAllElementsInList();
        listManager.redoCmd();
    }
}
