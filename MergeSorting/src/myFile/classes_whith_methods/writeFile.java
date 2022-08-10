package myFile.classes_whith_methods;

import java.io.*;
import java.util.Scanner;

public class writeFile {
    public static void write(String[] mas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            try (FileWriter writer = new FileWriter(mas[i], false)) {
                int[] array = new int[3];

                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter number:");
                    array[i] = scanner.nextInt();
                }

                for (int k : array) {
                    writer.append('*');
                    System.out.println();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
