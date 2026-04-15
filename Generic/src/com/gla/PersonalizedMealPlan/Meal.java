package com.gla.PersonalizedMealPlan;

public class Meal <T extends MealPlan>{
    private T mealPlan;

    public void setMealPlan(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void showMealPlan() {
        System.out.println(mealPlan.getPlanDetails());
    }
}
