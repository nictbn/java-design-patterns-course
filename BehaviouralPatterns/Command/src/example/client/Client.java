package example.client;

import example.command.CloseFileCommand;
import example.command.OpenFileCommand;
import example.command.WriteFileCommand;
import example.invoker.FileInvoker;
import example.receiver.FileSystemReceiver;
import example.util.FileSystemReceiverUtil;

public class Client {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker invoker = new FileInvoker(openFileCommand);
        invoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        invoker = new FileInvoker(writeFileCommand);
        invoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        invoker = new FileInvoker(closeFileCommand);
        closeFileCommand.execute();
    }
}
