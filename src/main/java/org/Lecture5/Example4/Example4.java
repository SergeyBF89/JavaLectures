package org.Lecture5.Example4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "three");
        map.put(1, "two");
        map.put(2, "one");
        System.out.println(map); // {3=three, 1=two, 2=one}

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(3, "three");
        map1.put(1, "one");
        map1.put(2, "two");
        System.out.println(map1); // {1=one, 2=two, 3=three}
    }
}
