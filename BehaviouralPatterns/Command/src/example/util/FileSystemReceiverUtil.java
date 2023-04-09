package example.util;

import example.receiver.FileSystemReceiver;
import example.receiver.UnixFileSystemReceiver;
import example.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
