package JAVA;

import java.util.Scanner;

public class find_Biggest_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 numbers : ");
            int count = sc.nextInt();

            // int big = 0;
            int n = 0;
            int small = 0;
            for(int i = 0; i<count; i++){
                n = sc.nextInt();
                // if(n > big){
                //     big = n;
                // }
                if(n <small){
                    small = n;
                }
            }
            // System.out.println("The biggest number is :" + big);
            System.out.println("The smallest number is " + small);
        }
    }
}
