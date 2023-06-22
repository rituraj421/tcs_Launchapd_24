package JAVA;

import java.util.Scanner;

// an input string can be complete if additional letters can be added and noletters neeed to be taken away to match . furthermore the order of letters in the input string must be the same as he order of letters in final word

// create a function thet, given an input string, detrmines if the word can be completed

public class question_23 {

    static boolean canComplete(String input, String word) {
        int v = -1;
        String newstr = "";
        for (int x = 0; x < input.length(); x++) {
            for (int y = v + 1; y < word.length(); y++) {

                if (input.charAt(x) == word.charAt(y)) {
                    v = y;
                    newstr = newstr + input.charAt(x);
                    break;
                }
            }
        }
        System.out.println(newstr);
        if(newstr.equals(input)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string : ");
        String i = sc.nextLine();

        System.out.println("Enter word String : ");
        String w = sc.nextLine();

        System.out.println(canComplete(i, w));

        sc.close();
    }
}