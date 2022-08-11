package myFile.main;

import myFile.classes_whith_methods.readFile;
import myFile.classes_whith_methods.writeFile;
import myFile.mergeSorting.MergeArray;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*String nam = "in1.txt";
        File file = new File(nam);
        String[] arrayFiles = {"in1.txt", "in2.txt", "in3.txt"};


        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("number");
        fileWriter.write(9);
        fileWriter.flush();

        FileReader fileReader = new FileReader("in1.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String[] arr = {"hello", "nt"};
        bufferedWriter.write(arr[0]);
        bufferedWriter.newLine();
        bufferedWriter.write(arr[1]);
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] mas = new String[3];
        while (bufferedReader.ready()) {
            mas[0] = bufferedReader.readLine();
            mas[1] = bufferedReader.readLine();
            mas[2] = bufferedReader.readLine();
        }

        System.out.println(Arrays.toString(mas));*/

        String[] array = {"in1.txt", "in2.txt", "in3.txt"};
        String[] mas1 = new String[1];
        String[] mas2 = new String[1];
        String[] mas3 = new String[1];

        for (int i = 0; i < array.length; i++) {
            writeFile.write(array[i]);
            System.out.println(Arrays.toString(new Vector[]{readFile.read(array[i])}));
        }

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
        System.out.println(Arrays.toString(MergeArray.merge(newMas1, newMas2, newMas3,count)));
    }
}
