package challenge.builder;

import challenge.product.Meal;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
