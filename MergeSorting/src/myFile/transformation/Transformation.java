package myFile.transformation;

public class Transformation {
    public static int[] transformation(String[] stringArray) {
        int[] array = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        return array;
    }
}
