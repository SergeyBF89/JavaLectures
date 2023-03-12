package org.Lecture2.Example2;

import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sn = "СЕРГЕЙ НИ.";
        System.out.println(sn.toLowerCase()); // нижний регистр // сергей ни.
        System.out.println(String.join("", name)); // объединение строки // Сергей
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й")); // С,е,р,г,е,й
    }
}
