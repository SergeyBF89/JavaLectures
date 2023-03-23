package org.Lecture6.Example3;

import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set); // [1, 2, 3, 4, 5]

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        System.out.println(set2); // [1, 2, 3, 6]

//        set.removeAll(set2);
//        System.out.println(set); // [4, 5]
//        set.retainAll(set2);
//        System.out.println(set); // [1, 2, 3]
        set.removeAll(set);
        System.out.println(set); // []
    }
}
