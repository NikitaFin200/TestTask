package myFile.main;

import myFile.classes_whith_methods.firstFile;
import myFile.classes_whith_methods.writeFile;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How mane files do&");
        int filesQuantity = scanner.nextInt();
        String[] arrayFiles = new String[filesQuantity];

        for (int i = 0; i < filesQuantity; i++) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            arrayFiles[i] = name;
        }

        for (int i = 0; i < filesQuantity; i++) {
            String name=arrayFiles[i];
            writeFile.write(name);
        }
    }
}
