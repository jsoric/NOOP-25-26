package commands;

public class UndoCommand implements Command {

    private CommandPatternHandler handler;

    public UndoCommand(CommandPatternHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.undo();
    }

    @Override
    public void undo() {
        // Undo undo-a nema smisla → prazno
    }
}
