package com.gla.MultiCatchBlock;
import java.util.Scanner;
public class ArrayOperation {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr = null;
        try {
            System.out.println("Size of array:");
            int size = sc.nextInt();
            arr = new int[size];
            System.out.println("Enter" + size + "element.");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter index to retrieve the value:");
            int index = sc.nextInt();
            int value=arr[index];
            System.out.println("Value at index"+index+":"+value);

        }
        catch (ArithmeticException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
