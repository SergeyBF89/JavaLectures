package org.Lecture6.Example1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(22);
        set.add(322);
        set.add(5);
        set.add(1234);
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            System.out.println(element);
//        }
//        System.out.println();
//        for (Object object : set) {
//            System.out.println(object);
//        }
//        Stream<Integer> stream = set.stream();
//        stream.forEach(System.out::println);
        set.remove(1234);
        System.out.println(set); // [1, 322, 5, 22]
        Set<Integer> set1 = new HashSet<>();
        set1.add(1234);
        set1.addAll(set);
        System.out.println(set1); // [1, 1234, 322, 5, 22]
        set.removeAll(set1);
        System.out.println(set); // []

    }

}
