package JAVA;

import java.util.HashSet;

// we can perform CRUD operations using Collections
// Duplicates are not allowed in HashSet

public class question_19 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(90);
        set.add(80);
        set.add(190);
        set.add(78);
        set.add(80);

        System.out.println(set);
        for (int i : set) {
            System.out.println(i + " ");
        }
        System.out.println(set.contains(30));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("hey");
        set1.add("Hey");

        System.out.println(set1);
    }
}
