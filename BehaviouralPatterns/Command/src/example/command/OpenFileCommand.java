package example.command;

import example.command.Command;
import example.receiver.FileSystemReceiver;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    // store previous state for undo


    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // if we had an undo we would save the previous state first
        this.fileSystemReceiver.openFile();
    }
}
