package JAVA;

import java.util.Scanner;

// check if a sgtring is a pallindrome
public class question_21 {

    static boolean isPallindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
        sc.close();
    }
}
