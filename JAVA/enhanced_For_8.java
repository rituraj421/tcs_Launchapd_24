package JAVA;

import java.util.Arrays;

public class enhanced_For_8 {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        int[] ar = { 1, 2, 3, 4, 5 };

        for (int a : ar) {
            if (a == 2) {
                System.out.println(a);
            }
        }

        System.out.println(Arrays.toString(ar));

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
