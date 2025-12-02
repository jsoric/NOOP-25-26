package pckg_lst_cmd;

public interface Cmd {

    void execute();
    void undo();
    void redo();
}
