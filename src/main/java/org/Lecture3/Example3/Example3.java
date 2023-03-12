package org.Lecture3.Example3;

import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add(2809);
        list1.add("Hello world!");
        for (Object o : list) {
            System.out.println(o);
        }
        for (Object o: list1) {
            System.out.println(list1);
        }
    }
}
