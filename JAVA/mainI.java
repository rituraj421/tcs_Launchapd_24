package JAVA;

import java.util.Scanner;

public class mainI {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your id : ");
            int id = sc.nextInt();

            System.out.println("Enter your name : ");
            String name = sc.next();

            System.out.println("Enter your gender : ");
            char gender = sc.next().charAt(0);

            System.out.println("Enter your marks1 : ");
            float marks1 = sc.nextFloat();

            System.out.println("Enter your marks2 : ");
            float marks2 = sc.nextFloat();

            System.out.println("Enter your marks3 : ");
            float marks3 = sc.nextFloat();

            // System.out.println("select t/f ");
            // boolean active = sc.nextBoolean();

            double result = marks1 + marks2 + marks3;

            System.out.println("My id is " + id + " my gender is " + gender +  " my name is " + name + " my result is " + result);

            // specific digit after decimal

            String s1 = String.format("%.4f", result);
            System.out.println(s1);
        }

    }
}
