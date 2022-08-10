package myFile.classes_whith_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class firstFile {
    public static double[] array;

    public static double[] read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("in1.txt"));
        int count = scanner.nextInt();
        array = new double[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextDouble();
        }

        scanner.close();

        return array;
    }
}
