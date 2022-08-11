package myFile.classes_whith_methods;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class writeFile {
    public static void write(String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Vector<String> vector = new Vector<>();
        File file = new File(name);
        System.out.println("1 - exit");
        System.out.println("2 - continue");
        int number;

        int command = scanner.nextInt();
        while (command != 1) {
            if (command == 2) {
                System.out.println("Please, enter number:");
                number = scanner.nextInt();
                vector.add(String.valueOf(number));
            }

            System.out.println("Please, enter command:");
            command = scanner.nextInt();
        }

        //System.out.println(vector);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String s : vector) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

