package com.gla.UserDefineException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter age:");
            int Age=sc.nextInt();
            AgeValidation.validateAge(Age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
