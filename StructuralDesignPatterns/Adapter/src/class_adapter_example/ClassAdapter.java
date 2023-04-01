package class_adapter_example;

public class ClassAdapter extends IntegerValueImpl {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
