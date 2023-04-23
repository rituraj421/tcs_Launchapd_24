package JAVA;

import java.util.Scanner;

public class read_Digits_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        String str = num + "";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // another method

        System.out.println("Enter num2 : ");
        int nums = sc.nextInt();
        int sum = 0;

        while (nums > 0) {
            int digit = nums % 10;
            System.out.print(digit + " ");
            nums = nums / 10;
            System.out.println(nums + " the number ");

            sum = sum + digit;
            System.out.println("The sum of digits is " + sum);

        }
        System.out.println("Sum of digits is " + sum);
        sc.close();
    }
}
