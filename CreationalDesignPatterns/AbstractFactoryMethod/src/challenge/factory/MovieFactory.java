package challenge.factory;

import challenge.product.bollywood.BollywoodMovie;
import challenge.product.hollywood.HollywoodMovie;

public interface MovieFactory {
    HollywoodMovie getHollywoodMovie();
    BollywoodMovie getBollywoodMovie();
}
