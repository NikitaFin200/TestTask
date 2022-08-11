package myFile.classes_whith_methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class readFile {
    public static Vector<String> read(String name) throws IOException {
        FileReader fileReader = new FileReader(name);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Vector<String> vector = new Vector<>();

        while (bufferedReader.ready()) {
            vector.add(bufferedReader.readLine());
        }

        return vector;
    }
}
