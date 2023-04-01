package class_adapter_example;

public class ObjectAdapter implements IntegerValue{
    IntegerValue integerValue;

    public ObjectAdapter(IntegerValue integerValue) {
        this.integerValue = integerValue;
    }

    @Override
    public int getInteger() {
        return 2 + integerValue.getInteger();
    }
}
