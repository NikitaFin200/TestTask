package myFile.mergeSorting;

import java.util.Arrays;

public class MergeArray {
    public static int[] merge(String[] mas1, String[] mas2) {
        int[] newArray = new int[mas1.length + mas2.length];
        int positionA = 0, positionB = 0;
        int mas=Integer.parseInt(Arrays.toString(mas1));
        for (int i = 0; i < newArray.length; i++) {
            if (positionA == mas1.length) {
                newArray[i] = mas2[i - positionB];
                positionB++;
            } else if (positionB == mas1.length) {
                newArray[i] = mas1[i - positionA];
                positionA++;
            } else if (mas1[i - positionA] < mas2[i - positionB]) {
                newArray[i] = mas1[i - positionA];
                positionB++;
            } else {
                newArray[i] = mas2[i - positionB];
                positionA++;
            }
        }

        return newArray;
    }
}
