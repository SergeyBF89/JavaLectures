package org.Lecture3.Example5;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        Character value = null;
        //List<Character> list = List.of('S', 'e', 'r', 'g', 'e', 'y');
        ArrayList<Character> list = new ArrayList<>();
        list.add('S'); list.add('e'); list.add('r'); list.add('g'); list.add('e'); list.add('y');
        //System.out.println(list); // [S, e, r, g, e, y]
        list.remove(1); // попытались удалить элемент по 1 индексом
        //System.out.println(list); // Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(list); // [S, r, g, e, y]
    }
}
