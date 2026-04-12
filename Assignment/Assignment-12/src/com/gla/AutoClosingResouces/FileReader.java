package com.gla.AutoClosingResouces;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            BufferedReader f1 = new BufferedReader(new java.io.FileReader("info.txt"));
            Scanner sc = new Scanner(f1);
            if (sc.hasNextLine()) {
                System.out.println("First line:"+sc.nextLine());
            }else{
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
