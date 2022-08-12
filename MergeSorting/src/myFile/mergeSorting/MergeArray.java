package myFile.mergeSorting;

public class MergeArray {
    public static int[] merge(int[] mas1, int[] mas2, int[] mas3, int count) {
        int[] newArray = new int[mas1.length + mas2.length];                    //провдим слияние массивов

        int i = 0, j = 0;

        for (int k = 0; k < newArray.length; k++) {
            if (i > mas1.length - 1) {
                newArray[k] = mas2[j];
                j++;
            } else if (j > mas2.length - 1) {
                newArray[k] = mas1[i];
                i++;
            } else if (mas1[i] < mas2[j]) {
                newArray[k] = mas1[i];
                i++;
            } else {
                newArray[k] = mas2[j];
                j++;
            }
        }

        if (count != 3) {
            count++;
            newArray = merge(newArray, mas3, mas2, count);
        }

        return newArray;
    }
}
