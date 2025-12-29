package commands;

public class RedoCommand implements Command {

    private CommandPatternHandler handler;

    public RedoCommand(CommandPatternHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.redo();
    }

    @Override
    public void undo() {
        // Redo nema undo
    }
}
