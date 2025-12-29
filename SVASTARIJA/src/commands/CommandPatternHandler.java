package commands;

import java.util.Stack;


public class CommandPatternHandler {

    private Command command;

    private final Stack<Command> redoStack = new Stack<>();
    private final Stack<Command> undoStack = new Stack<>();

    public void execute(Command command) {
        this.command = command;
        this.command.execute();

        undoStack.push(this.command);
        redoStack.clear();
    }

    public void undo() {
        var undoCommand = undoStack.pop();

        undoCommand.undo();
        redoStack.push(undoCommand);
    }

    public void redo() {
        if (redoStack.empty())
            return;
        var redoCommand = redoStack.pop();
        redoCommand.execute();
        undoStack.push(redoCommand);
    }
}


