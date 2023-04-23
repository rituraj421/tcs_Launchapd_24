package JAVA;

import java.util.Scanner;

public class logical_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks1 : ");
        Double a = sc.nextDouble();

        System.out.println("Enter Marks2 : ");
        Double b = sc.nextDouble();

        System.out.println("Enter marks3 : ");
        Double c = sc.nextDouble();

        Double avg = (a + b + c) / 3;
        Double percentage = (avg / 100) * 100;
        if (percentage >= 80) {
            System.out.printf("You are passed , you have scored %.2f" , percentage);
        } 
        else {
            System.out.printf("Your score is %.2f", percentage);
        }
        sc.close();
    }
}