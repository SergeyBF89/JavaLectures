package org.Lecture5.Example2;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.putIfAbsent(1, "one");
        map.putIfAbsent(2, "two");
        map.putIfAbsent(3, "three");
        System.out.println(map); // {1=one, 2=two, 3=three}

        for (var item : map.entrySet()) {
            System.out.printf("[%d: %s] ", item.getKey(), item.getValue()); // [1: one] [2: two] [3: three]
        }
    }
}
