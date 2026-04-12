package com.gla.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            File f1 = new File("data.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

}
