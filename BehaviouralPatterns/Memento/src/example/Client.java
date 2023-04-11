package example;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First set of data: \nAda Lovelace\nCharles Babbage");
        System.out.println(fileWriterUtil + "\n\n");

        caretaker.save(fileWriterUtil);
        fileWriterUtil.write("\nSecond set of data:\nTuring\nAlonso");
        System.out.println(fileWriterUtil + "\n\n");
        caretaker.undo(fileWriterUtil);
        System.out.println(fileWriterUtil + "\n\n");
    }
}
