package com.gla.PersonalizedMealPlan;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.setMealPlan(new VegetarianMeal());
        vegMeal.showMealPlan();
        MealGenerator.generateMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.setMealPlan(new VeganMeal());
        veganMeal.showMealPlan();
        MealGenerator.generateMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>();
        ketoMeal.setMealPlan(new KetoMeal());
        ketoMeal.showMealPlan();
        MealGenerator.generateMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal = new Meal<>();
        proteinMeal.setMealPlan(new HighProteinMeal());
        proteinMeal.showMealPlan();
        MealGenerator.generateMeal(new HighProteinMeal());
    }
}
