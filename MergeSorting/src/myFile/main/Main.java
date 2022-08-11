package myFile.main;

import myFile.classes_whith_methods.readFile;
import myFile.classes_whith_methods.writeFile;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

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

        writeFile.write(array[0]);
        System.out.println(Arrays.toString(readFile.read(array[0])));
    }
}
