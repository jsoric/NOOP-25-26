import Commands.Command;

import java.util.Stack;

public class CommandHandler {

    private final Stack<Command> redoStack = new Stack<>();
    private final Stack<Command> undoStack = new Stack<>();

    public void execute(Command command){
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        Command undoCommand = undoStack.pop();
        undoCommand.undo();
        redoStack.push(undoCommand);
    }

    public void redo(){
        if (redoStack.empty())
            return;
        Command redoCommand = redoStack.pop();
        redoCommand.execute();
        undoStack.push(redoCommand);
    }
}

