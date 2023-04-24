package JAVA;

import java.util.ArrayList;

public class collection_13 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add("java");
        list.add(true);

        for (var l : list) {
            System.out.println(l);
        }

        System.out.println("size of array list is " + list.size());

        list.remove("java");
        list.remove(0);
        for (var l : list) {
            System.out.println(l);
        }

    }
}
