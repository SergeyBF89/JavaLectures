package org.Lecture5.Example3;

import java.util.TreeMap;

public class Example3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(6, "six");
        map.put(4, "four");
        map.put(3, "three");
        map.put(2, "two");
        map.put(5, "five");
        //map.clear(); // полностью очищает коллекцию
        System.out.println(map); // {1=one, 2=two, 3=three, 4=four, 5=five, 6=six}
        System.out.println(map.descendingKeySet()); // [6, 5, 4, 3, 2, 1] возвращает номера ключей в обратном порядке
        System.out.println(map.descendingMap()); // {6=six, 5=five, 4=four, 3=three, 2=two, 1=one}
        System.out.println(map.entrySet()); // [1=one, 2=two, 3=three, 4=four, 5=five, 6=six]
        System.out.println(map.ceilingEntry(3)); // 3=three
        System.out.println(map.clone()); // {1=one, 2=two, 3=three, 4=four, 5=five, 6=six}
        System.out.println(map.ceilingKey(6)); // 6

    }
}
