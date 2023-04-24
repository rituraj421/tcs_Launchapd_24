package JAVA;

import java.util.Arrays;

public class array_12 {
    public static void main(String[] args) {
        int[] arr = { 12, 33, 44, 02, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // USING FOR-EACH LOOP
        for (int a : arr) {
            System.out.print(a + " "); // here we will print only a , arr[a] will throw out of bond error
        }
        System.out.println();

        // character array
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println(Arrays.toString(ch));
        System.out.println(ch[1]);

        // STRING ARRAY
        String[] str = { "java", "c", "python" };

        for (int s = 0; s < str.length; s++) {
            System.out.print(str[s] + " ");
        }
        System.out.println();

        // CONVERT AND STRING TO CHAR ARRAY

        String str1 = "tata";
        char[] char1 = str1.toCharArray();
        for (char c : char1) {
            System.out.print(c +" ");
        }
        System.out.println();
    }
}
