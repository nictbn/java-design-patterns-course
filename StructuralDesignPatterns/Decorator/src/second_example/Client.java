package second_example;

import java.io.*;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException {
        String path = Paths.get("").toAbsolutePath() + File.separator + "StructuralDesignPatterns" + File.separator + "Decorator" + File.separator + "test.txt";
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)));
        while ((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
        in.close();
    }
}
