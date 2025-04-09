package mod2_collections.lesson24_array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrNumbers = new int[10];
        arrNumbers[0] = 21;
        arrNumbers[1] = 29;
        arrNumbers[2] = 38;
        arrNumbers[3] = 24;
        arrNumbers[4] = 35;
        arrNumbers[5] = 60;
        arrNumbers[6] = 73;
        arrNumbers[7] = 18;
        arrNumbers[8] = 9;
        arrNumbers[9] = 10;
//        arrNumbers[10] = 123; ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(arrNumbers));
        System.out.println("The 5th element of array is " + arrNumbers[4]);

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("The index is " + i + ", the value is " + arrNumbers[i]);
        }

        System.out.println();
        int[] arrNumbers2 = {21, 29, 38, 24, 35, 60, 73, 18, 9, 10};
        System.out.println(Arrays.toString(arrNumbers2));
        for (int i = 0; i < arrNumbers2.length; i++) {
            System.out.println("The index is " + i + ", the value is " + arrNumbers2[i]);
        }
    }
}
