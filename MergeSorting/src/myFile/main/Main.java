package myFile.main;

import myFile.classes_whith_methods.readFile;
import myFile.classes_whith_methods.writeFile;
import myFile.mergeSorting.MergeArray;
import myFile.transformation.PyramidSort;
import myFile.transformation.Transformation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name of output fileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee:");
        String outputFileName = scanner.nextLine();

        System.out.println("Please enter names of the three input files:");
        int filesQuantity = 0;
        String[] fileNamesArray = new String[3];  //массив с именами файлов, который будем сливать в единный

        while (filesQuantity < 3) {
            System.out.print(filesQuantity + 1 + ":");
            fileNamesArray[filesQuantity] = scanner.nextLine();
            System.out.println();
            filesQuantity++;
        }

        int number;
        int counter = 0;   //счетчик количества файлов в массиве

        do {
            Vector<String> vector = new Vector<>();    //объявление вектора для заполнения его числами
            int command = 2;

            while (command != 1) {
                if (command == 2) {
                    System.out.println("Please, enter number:");
                    number = scanner.nextInt();
                    vector.add(String.valueOf(number)); //если команда 2, то в конец вектора добавляем число, которое ввели
                }

                System.out.println("1-exit");
                System.out.println("2-continue");
                System.out.println("Please, enter command:");
                command = scanner.nextInt();    //если введем команду 1, то внутренний цикл while прекратится
            }

            if (vector.size() == 1) {
                writeFile.write(fileNamesArray[counter], vector);
            } else {
                for (int i = 1; i < vector.size(); i++) {
                    boolean sortingCheck = false;

                    try {
                        int first = Integer.parseInt(vector.get(i - 1));
                        int second = Integer.parseInt(vector.get(i));

                        if (first > second) {
                            throw new NullPointerException("The vector is not sorted");
                        }
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Do you want sort hin?");
                        System.out.println("0-no");
                        System.out.println("1-yes");

                        while (true) {
                            int answer = scanner.nextInt();

                            if (answer == 0) {
                                throw new IllegalArgumentException("vector is not sorted");
                            } else if (answer == 1) {
                                PyramidSort.sort(vector);
                                sortingCheck = true;
                                break;
                            } else {
                                System.out.println("not correct, try again:");
                            }
                        }

                    } finally {
                        writeFile.write(fileNamesArray[counter], vector);       //создает файл с названием из нашего массива, и записывает на каждую строку этого файла элемент вектора
                    }

                    if (sortingCheck) {
                        break;
                    }
                }
            }

            System.out.println(fileNamesArray[counter]);
            System.out.println(Arrays.toString(new Vector[]{readFile.read(fileNamesArray[counter])}));    //данные файла заполняются в вектор и выводится в консоль(для того, чтобы сразу увидеть что ввели)
            counter++;                                                                                    //счетчик количества файлов
        } while (counter != fileNamesArray.length);

        String[] stringElementsArray1 = new String[1];         //объявляем 3 массива тип String, для того чтобы потом в них передать элементы с вектора
        String[] stringElementsArray2 = new String[1];
        String[] stringElementsArray3 = new String[1];

        stringElementsArray1 = readFile.read(fileNamesArray[0]).toArray(stringElementsArray1);    //переносим значения вектора в массива
        stringElementsArray2 = readFile.read(fileNamesArray[1]).toArray(stringElementsArray2);
        stringElementsArray3 = readFile.read(fileNamesArray[2]).toArray(stringElementsArray3);

        int[] newMas1 = Transformation.transformation(stringElementsArray1);                      //преоброзуем массив строк в целочисленный массив
        int[] newMas2 = Transformation.transformation(stringElementsArray2);
        int[] newMas3 = Transformation.transformation(stringElementsArray3);

        int count = 2;
        System.out.println(Arrays.toString(MergeArray.merge(newMas1, newMas2, newMas3, count)));

        int[] y = MergeArray.merge(newMas1, newMas2, newMas3, count);
        String[] fin = new String[y.length];

        for (int i = 0; i < y.length; i++) {
            fin[i] = String.valueOf(y[i]);
        }

        Vector<String> finalVector = new Vector<>();       //объявление ветора для итоговых значений

        Collections.addAll(finalVector, fin);
        writeFile.write(outputFileName, finalVector);
    }
}
