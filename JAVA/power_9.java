package JAVA;

import java.util.Scanner;

public class power_9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter x : ");
            int x = sc.nextInt();

            System.out.println("Enter y : ");
            int y = sc.nextInt();

            int power = 1;

            for (int i = 0; i < y; i++) {
                power = power * x;
                System.out.println(power);
            }
            System.out.println("x^y = " + power);
        }
    }
}
