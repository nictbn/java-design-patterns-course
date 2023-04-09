package example.invoker;

import example.command.Command;

public class FileInvoker {
    Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
