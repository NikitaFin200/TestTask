package myFile.classes_whith_methods;

import java.io.*;
import java.util.Vector;

public class writeFile {
    public static void write(String name, Vector<String> vector) throws IOException {
        File file = new File(name);                                 //создаем новый файл с заданым название
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

