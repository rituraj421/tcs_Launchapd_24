package JAVA;
// create an arrayList and add names of five fruits in it

// read the fruit name as an input and check if it is available in thsw list

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class question_17 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("mango");
        fruit.add("banana");
        fruit.add("angoor");
        fruit.add("anaar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit name :");
        String name = sc.nextLine();

        if (fruit.contains(name)) {
            System.out.println(name + " is abvailable in the list");
        } 
        else {
            System.out.println(name + " is not present in the list ");
        }
        System.out.println(fruit);

        // alternate method

        // for(String f : fruit){
        // if(f.equals(name)){
        // System.out.println(f);
        // }
        // else{
        // System.out.println(name + " is not present");
        // }
        // }

        sc.close();
    }
}
