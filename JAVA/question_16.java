package JAVA;

import java.util.Arrays;
import java.util.Scanner;

//  create an array and read 5 numbers into the array
// read two numbers(range) as input and check how many numbers in the range exists in the array
// print the count if the number in that range exixt else print "No number in this range"

public class question_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            System.out.println("Enter number x :");
            int x = sc.nextInt();
            System.out.println("Enter number Y :");
            int y = sc.nextInt();
            int count = 0;

            int i = 0;
            for (i = 0; i < nums.length; i++) {
                System.out.println("Enter 5 numbers :" + i);
                nums[i] = sc.nextInt();
                if (nums[i] >= x && nums[i] <= y) {
                    count++;
                }
            }

            System.out.println(Arrays.toString(nums));
            System.out.println("There are " + count + " Numbers present");
        }
    }
}
