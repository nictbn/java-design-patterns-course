package challenge.builder;

import challenge.product.Meal;
import challenge.item.ChickenBurger;
import challenge.item.Pepsi;

public class NonVegetarianMealBuilder implements MealBuilder{
    private Meal nonVegetarianMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegetarianMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegetarianMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegetarianMeal;
    }
}
