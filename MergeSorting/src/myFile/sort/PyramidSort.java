package myFile.sort;

import java.util.Vector;

public class PyramidSort {
    public static Vector<String> sorttt(Vector<String> vector) {
        int[] array = new int[vector.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(vector.get(i));
        }

        heapSort(array);
        Vector<Integer> arr = new Vector<>();

        for (int i = 0; i < array.length; i++) {
            arr.add(i, array[i]);
        }

        for (Integer integer : arr) {
            vector.add(String.valueOf(Integer.parseInt(String.valueOf(integer))));
        }

        return vector;
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

