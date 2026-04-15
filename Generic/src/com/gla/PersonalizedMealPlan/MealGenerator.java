package com.gla.PersonalizedMealPlan;

public class MealGenerator {
    public static <T extends MealPlan> void generateMeal(T meal) {
        if (meal != null) {
            System.out.println("Generated Meal Plan:");
            System.out.println(meal.getPlanDetails());
        } else {
            System.out.println("Invalid Meal Plan!");
        }
    }
}
