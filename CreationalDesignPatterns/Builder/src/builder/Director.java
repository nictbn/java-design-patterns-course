package builder;

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
    }
}
