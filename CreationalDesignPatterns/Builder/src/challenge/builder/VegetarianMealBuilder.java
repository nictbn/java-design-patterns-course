package challenge.builder;

import challenge.product.Meal;
import challenge.item.Coke;
import challenge.item.VeggieBurger;

public class VegetarianMealBuilder implements MealBuilder {
    private Meal vegetarianMeal = new Meal();
    @Override
    public void buildBurger() {
        vegetarianMeal.addItem(new VeggieBurger());
    }

    @Override
    public void buildDrink() {
        vegetarianMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegetarianMeal;
    }
}
