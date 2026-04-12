package com.gla.NestedTryCatch;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Size of array:");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter array element.");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter index:");
            int index = sc.nextInt();

            System.out.println("Enter divisor:");
            int divisor = sc.nextInt();

            try {
                int value = arr[index];

                try {
                    int result = value / divisor;
                    System.out.println("Result:" + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("Invalid input type");
        }
    }
}
