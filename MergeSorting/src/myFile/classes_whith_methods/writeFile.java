package myFile.classes_whith_methods;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class writeFile {
    public static void write(String name, Vector<String> vector) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(name);
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

