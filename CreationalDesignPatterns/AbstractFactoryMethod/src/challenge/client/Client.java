package challenge.client;

import challenge.factory.FactoryProducer;
import challenge.factory.MovieFactory;
import challenge.product.bollywood.BollywoodMovie;
import challenge.product.hollywood.HollywoodMovie;

public class Client {
    public static void main(String[] args) {
        MovieFactory actionMovies = FactoryProducer.getFactory("action");
        MovieFactory comedyMovies = FactoryProducer.getFactory("comedy");

        HollywoodMovie hollywoodActionMovie = actionMovies.getHollywoodMovie();
        BollywoodMovie bollywoodActionMovie = actionMovies.getBollywoodMovie();

        HollywoodMovie hollywoodComedyMovie = comedyMovies.getHollywoodMovie();
        BollywoodMovie bollywoodComedyMovie = comedyMovies.getBollywoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(hollywoodActionMovie.getMovieName());
        System.out.println(bollywoodActionMovie.getMovieName());

        System.out.println("\nComedy movies are:");
        System.out.println(hollywoodComedyMovie.getMovieName());
        System.out.println(bollywoodComedyMovie.getMovieName());
    }
}
