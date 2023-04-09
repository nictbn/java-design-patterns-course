package example.command;

import example.command.Command;
import example.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // if we had an undo we would save the previous state first
        this.fileSystemReceiver.closeFile();
    }
}
