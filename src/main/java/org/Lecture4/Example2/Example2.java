package org.Lecture4.Example2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        System.out.println(list.size()); // 3
//        System.out.println(list.isEmpty()); // false
//        System.out.println(list.get(1)); // 2
//        System.out.println(list); // [1, 2, 3]
//        System.out.println(list.set(1, 4)); // добавил 4 вместо 2
//        System.out.println(list); // [1, 4, 3]
        list.remove(1);
        //System.out.println(list); // [1, 3]

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list.addAll(list1);
        System.out.println(list);// [1, 3, 4, 5, 6]
    }
}
