package JAVA;

import java.util.Arrays;
import java.util.Scanner;

// search and find the smallest/biggest number in an array of 10 numnber

public class question_18 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        int big = nums[0];
        // int small = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter 5 numbers : " + i);
            nums[i] = sc.nextInt();

            if (nums[i] > big) {
                big = nums[i];

            }

        }
        System.out.println("The biggest number is " + big);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
