package JAVA;

import java.util.ArrayList;
import java.util.Collections;

public class swap_List_15 {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(29);
        ar.add(32);
        ar.add(15);
        ar.add(31);
        ar.add(47);
        // ar.add(91);

        System.out.println(ar);

        // Collections.swap(ar, 1,3);

        // System.out.println(ar);

        int s = ar.size();
        int ele = s / 2;
        int mod = s % 2;

        for (int i = 0; i < ele; i++) {
            if (mod == 0) {
                Collections.swap(ar, i, i + ele);
            } 
            else {
                Collections.swap(ar, i, i + 1 + ele);
            }
        }
        for (int j = 0; j < ar.size(); j++) {
            System.out.println(ar.get(j));
        }
    }
}
