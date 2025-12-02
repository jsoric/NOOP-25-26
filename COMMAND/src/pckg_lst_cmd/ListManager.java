package pckg_lst_cmd;

import java.util.List;
import java.util.Stack;

public class ListManager<E> {

    private List<E> someList;
    private Cmd command;
    private final Stack<Cmd> undoStack;
    private final Stack<Cmd> redoStack;

    public ListManager(List<E> someList) {
        this.someList = someList;
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(Cmd cmd){
        command = cmd;
    }

    public void listAllElementsInList(){
        System.out.println("Listing all elements in list!!!");
        for (E e : someList){
            System.out.println(e);
        }
    }

    public void exeCommand(){
        command.execute();
        undoStack.add(command);
    }

    public void undoCmd(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo - the 'undo' stack is empty!");
        } else {
            command = undoStack.pop();
            command.undo();
            listStackElements(undoStack);
            redoStack.add(command);
            listStackElements(redoStack);
        }

    }

    public void redoCmd(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to redo - the 'redo' stack is empty!");
        } else {
            command = redoStack.pop();
            command.redo();
            listStackElements(redoStack);
            undoStack.add(command);
            listStackElements(undoStack);
        }
    }

    private void listStackElements(Stack<Cmd> someStack){
        System.out.println("\n================================= " + someStack.getClass().getSimpleName() + " =================================");
        for(Cmd element : someStack){
            System.out.println(element);
        }
        System.out.println("=====================================================");
    }


}
