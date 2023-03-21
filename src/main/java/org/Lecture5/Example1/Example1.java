package org.Lecture5.Example1;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.putIfAbsent(1, "один"); // делает проверку, если такой ключ есть, ничего не добавляет
        map.putIfAbsent(1, "qw");
        map.put(2, "два"); // обычный метод добавления
        map.put(null, "!null");
        System.out.println(map); // {null=!null, 1=один, 2=два}
        map.remove(null); // удаление по указанному ключу
        System.out.println(map); // {1=один, 2=два}
        System.out.println(map.containsKey(1)); // true
        System.out.println(map.containsKey(3)); // false
        System.out.println(map.containsValue("два")); // true
        System.out.println(map.containsValue("qw")); // false
        System.out.println(map.keySet()); // [1, 2] проверка всех имеющихся ключей
        System.out.println(map.values()); // [один, два] проверка всех имеющихся значений
        System.out.println(map.get(2)); // два (получение значения по указанному ключу)




    }
}
