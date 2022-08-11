package myFile.classes_whith_methods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static String[] read(String name) throws IOException {
        FileReader fileReader = new FileReader(name);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] mas = new String[3];
        while (bufferedReader.ready()) {
            mas[0] = bufferedReader.readLine();
            mas[1] = bufferedReader.readLine();
            mas[2] = bufferedReader.readLine();
        }

        return mas;
    }
}
