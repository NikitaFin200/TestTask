package myFile.classes_whith_methods;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class writeFile {
    public static void write(String name) throws IOException {
        File file = new File(name);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String[] arr = {"hello", "nt"};
        bufferedWriter.write(arr[0]);
        bufferedWriter.newLine();
        bufferedWriter.write(arr[1]);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

