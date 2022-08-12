package myFile.transformation;

import java.util.Vector;

public class PyramidSort {                                  //пирамидная сортировка
    public static void sort(Vector<String> vector) {
        int[] arrayIntegerVector = new int[vector.size()];

        for (int i = 0; i < arrayIntegerVector.length; i++) {                //целочисленный массив заполняем эелементами вектора
            arrayIntegerVector[i] = Integer.parseInt(vector.get(i));
        }

        heapSort(arrayIntegerVector);                                         //провдим сортировку
        Vector<Integer> vectorInteger = new Vector<>();

        for (int i = 0; i < arrayIntegerVector.length; i++) {                 //заполняем целочисленный вектор элементами массива
            vectorInteger.add(i, arrayIntegerVector[i]);
        }

        vector.clear();                                                        //чистим принимаемый вектор, для того чтобы в него положить отсортиоованный вектор

        for (Integer integer : vectorInteger) {                                 //заполняем принимаемый вектор
            vector.add(String.valueOf(Integer.parseInt(String.valueOf(integer))));
        }
    }

    public static void sift(int[] array, int length, int i) {
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        while (leftChildIndex < length) {
            int largestChildIndex = i;

            if (array[leftChildIndex] > array[largestChildIndex]) {
                largestChildIndex = leftChildIndex;
            }

            if (rightChildIndex < length && array[rightChildIndex] > array[largestChildIndex]) {
                largestChildIndex = rightChildIndex;
            }

            if (largestChildIndex == i) {
                return;
            }

            int temp = array[i];
            array[i] = array[largestChildIndex];
            array[largestChildIndex] = temp;

            i = largestChildIndex;

            leftChildIndex = 2 * i + 1;
            rightChildIndex = 2 * i + 2;
        }
    }

    public static void heapSort(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            sift(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sift(array, i, 0);
        }
    }
}

