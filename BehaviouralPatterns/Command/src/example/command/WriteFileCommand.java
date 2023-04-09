package example.command;

import example.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // if we had an undo we would save the previous state first
        this.fileSystemReceiver.writeFile();
    }
}
