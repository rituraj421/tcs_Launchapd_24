package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class max_14 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 6, 10 };

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // if we want to return the index , just write 'i'
            }
        }
        System.out.println(max);

        // adding numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        int[] input = new int[5];

        int sum = 0;
        for (int j = 0; j < input.length; j++) {
            input[j] = sc.nextInt();
            sum = sum + input[j];
        }
        System.out.println(sum);
        double average = sum / input.length;
        System.out.println(average);

        // print only odd numbers;

        int count = 0;
        int[] odd = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            input[j] = sc.nextInt();
            if (j % 2 != 0) {
                odd[count] = j;
                count++;
            }
        }
        for (int k = 0; k < odd.length; k++) {
            System.out.println(odd[k]);
        }

        // another approach to print odds
        System.out.println(count);
        odd = Arrays.copyOf(odd, count);

        System.out.println(Arrays.toString(odd));
        sc.close();
    }
}
