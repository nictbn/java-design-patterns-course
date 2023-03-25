package challenge.director;

import challenge.builder.MealBuilder;

public class Director {
    MealBuilder builder;

    public void construct(MealBuilder builder) {
        this.builder = builder;
        this.builder.buildBurger();
        this.builder.buildDrink();
    }
}
