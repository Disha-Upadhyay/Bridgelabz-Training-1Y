package com.gla.UserDefineException;

public class AgeValidation {
    static void validateAge(int Age) throws InvalidAgeException{
        if(Age>18)
            System.out.println("Access granted!");
        else
            System.out.println("Age must be 18 or above");
    }
}
