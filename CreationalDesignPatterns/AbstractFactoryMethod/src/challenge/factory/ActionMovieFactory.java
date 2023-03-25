package challenge.factory;

import challenge.product.bollywood.BollywoodActionMovie;
import challenge.product.bollywood.BollywoodMovie;
import challenge.product.hollywood.HollywoodActionMovie;
import challenge.product.hollywood.HollywoodMovie;

public class ActionMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
