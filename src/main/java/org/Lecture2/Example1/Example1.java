package org.Lecture2.Example1;

public class Example1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s); // таймер
    }
}
