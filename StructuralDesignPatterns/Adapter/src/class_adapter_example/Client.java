package class_adapter_example;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is a class adapter demo");
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class adapter returned: " + classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValueImpl());
        System.out.println("Object adapter returned: " + objectAdapter.getInteger());
    }
}
