package org.Lecture3.Example1;

// Тип данных Object
public class Example1 {
    public static void main(String[] args) {
        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}


