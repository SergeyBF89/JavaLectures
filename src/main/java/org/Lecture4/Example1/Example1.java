package org.Lecture4.Example1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add(null);
        list.add(null);
        list.add("2");
        list.add("3");
        list.add("3");
        //System.out.println(list); // [1, null, null, 2, 3, 3]
        list.remove(0); // удалил 0 индекс "1"
        //System.out.println(list); // [null, null, 2, 3, 3]
        list.remove("3"); // удалил элемент "3"
        list.remove("4"); // удалил элемент "4"
        //System.out.println(list); // [1, null, null, 2, 3]
        //System.out.println(list.size()); // 4

        List<String> insertedList = new ArrayList<>();

        insertedList.add("1");
        insertedList.add("2");
        insertedList.add("7");
        insertedList.add("7");
        System.out.println(insertedList); // [1, 2, 7, 7]
        list.addAll(2, insertedList); // указываем с какого индекса добавляем в коллекцию list данные из insertedList
        System.out.println(list); // [null, null, 1, 2, 7, 7, 2, 3]
        System.out.println(list.indexOf("7")); // 4
        System.out.println(list.get(3)); // 2
        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains("2")); // true
        System.out.println(list.contains("11")); // false

        for (String s : list) {
            System.out.println("Элемент листа: " + s);
        }

        // Создаем новую переменную с типом ArrayList
        ArrayList<String> arrayList = (ArrayList<String>) list;
        System.out.println(arrayList); // [null, null, 1, 2, 7, 7, 2, 3]

    }
}
