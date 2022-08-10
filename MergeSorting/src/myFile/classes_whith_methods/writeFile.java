package myFile.classes_whith_methods;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writeFile {
    public static void write(String fileName) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            int number = 0;
            System.out.println("-1 - exit");

            try {
                while (number != -1) {
                    number = scanner.nextInt();
                    out.println(number);
                }
            }
            finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
