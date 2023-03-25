package challenge.factory;

public class FactoryProducer {

    public static final String COMEDY = "COMEDY";
    public static final String ACTION = "ACTION";

    public static MovieFactory getFactory(String factoryType) {
        if (COMEDY.equalsIgnoreCase(factoryType)) {
            return new ComedyMovieFactory();
        } else if (ACTION.equalsIgnoreCase(factoryType)) {
            return new ActionMovieFactory();
        }
        throw new RuntimeException("Unsupported factory type");
    }
}
