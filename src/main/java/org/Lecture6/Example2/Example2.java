package org.Lecture6.Example2;

import java.util.Arrays;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var c = new HashSet<>(a);
        c.addAll(b);
        System.out.println(c); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        var d = new HashSet<>(a);
        d.retainAll(b);
        System.out.println(d); // [2, 3, 5, 7]
        var e = new HashSet<>(a);
        e.removeAll(b);
        System.out.println(e); // [1, 4, 6]
    }
}
