package challenge.factory;

import challenge.product.bollywood.BollywoodComedyMovie;
import challenge.product.bollywood.BollywoodMovie;
import challenge.product.hollywood.HollywoodComedyMovie;
import challenge.product.hollywood.HollywoodMovie;

public class ComedyMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
