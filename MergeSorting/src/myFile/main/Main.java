package myFile.main;

import myFile.classes_whith_methods.readFile;
import myFile.classes_whith_methods.writeFile;

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
        Object[] mas = new Object[0];
        for (int i = 0; i < array.length; i++) {
            writeFile.write(array[i]);
            mas = readFile.read(array[0]).toArray();
            System.out.println(Arrays.toString(new Vector[]{readFile.read(array[i])}));
        }

        System.out.println("mas" + Arrays.toString(mas));

    }
}
