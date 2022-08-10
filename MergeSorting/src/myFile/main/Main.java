package myFile.main;

import myFile.classes_whith_methods.writeFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayFiles = {"in1.txt", "in2.txt", "in3.txt"};

        writeFile.write(arrayFiles);
    }
}
