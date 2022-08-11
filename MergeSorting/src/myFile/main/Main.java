package myFile.main;

import myFile.classes_whith_methods.readFile;
import myFile.classes_whith_methods.writeFile;
import myFile.mergeSorting.MergeArray;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Vector<String> vec = new Vector<>();
        String[] array = {"in1.txt", "in2.txt", "in3.txt"};
        String[] mas1 = new String[1];
        String[] mas2 = new String[1];
        String[] mas3 = new String[1];

        int number;
        int counter = 0;

        do {
            Vector<String> vector = new Vector<>();
            int command = 2;
            while (command != 1) {
                if (command == 2) {
                    System.out.println("Please, enter number:");
                    number = scanner.nextInt();
                    vector.add(String.valueOf(number));
                }

                System.out.println("Please, enter command:");
                command = scanner.nextInt();
            }

            writeFile.write(array[counter], vector);
            System.out.println(Arrays.toString(new Vector[]{readFile.read(array[counter])}));
            counter++;
        } while (counter != array.length);

        mas1 = readFile.read(array[0]).toArray(mas1);
        mas2 = readFile.read(array[1]).toArray(mas2);
        mas3 = readFile.read(array[2]).toArray(mas3);

        System.out.println("mas1" + Arrays.toString(mas1));
        System.out.println("mas2" + Arrays.toString(mas2));
        System.out.println("mas3" + Arrays.toString(mas3));

        int[] newMas1 = new int[mas1.length];
        int[] newMas2 = new int[mas2.length];
        int[] newMas3 = new int[mas3.length];

        for (int i = 0; i < newMas1.length; i++) {
            newMas1[i] = Integer.parseInt(mas1[i]);
        }
        for (int i = 0; i < newMas2.length; i++) {
            newMas2[i] = Integer.parseInt(mas2[i]);
        }
        for (int i = 0; i < newMas3.length; i++) {
            newMas3[i] = Integer.parseInt(mas3[i]);
        }

        int count = 2;
        System.out.println(Arrays.toString(MergeArray.merge(newMas1, newMas2, newMas3, count)));
        int[] y = MergeArray.merge(newMas1, newMas2, newMas3, count);
        String[] fin = new String[y.length];

        for (int i = 0; i < y.length; i++) {
            fin[i] = String.valueOf(y[i]);
        }

        Collections.addAll(vec, fin);
        writeFile.write("final.txt", vec);
    }
}
