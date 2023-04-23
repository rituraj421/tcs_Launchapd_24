package JAVA;

public class for_Loop_5 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // print the values in reverse order

        for (int j = 5; j >= 0; j--) {
            System.out.print(" " + j);
        }
        System.out.println();

        // return 2's multiple

        for (int k = 1; k <= 5; k++) {
            System.out.println(k * 2);
        }
        
        System.out.println("Print the even numbers : ");

        for (int l = 10; l <= 20; l++) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
        }
    }
}
