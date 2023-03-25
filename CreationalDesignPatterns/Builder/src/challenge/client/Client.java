package challenge.client;

import challenge.builder.MealBuilder;
import challenge.builder.NonVegetarianMealBuilder;
import challenge.builder.VegetarianMealBuilder;
import challenge.director.Director;
import challenge.product.Meal;

public class Client {
    public static void main(String[] args) {
        System.out.println("Builder Challenge");

        Director director = new Director();
        MealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
        MealBuilder nonVegetarianMealBuilder = new NonVegetarianMealBuilder();

        director.construct(vegetarianMealBuilder);
        Meal vegetarianMeal = vegetarianMealBuilder.getMeal();
        director.construct(nonVegetarianMealBuilder);
        Meal nonVegetarianMeal = nonVegetarianMealBuilder.getMeal();

        System.out.println("Vegetarian Meal");
        vegetarianMeal.showItems();
        System.out.println("Total Cost: " + vegetarianMeal.getCost());

        System.out.println("Non Vegetarian Meal");
        nonVegetarianMeal.showItems();
        System.out.println("Total Cost: " + nonVegetarianMeal.getCost());

    }
}
