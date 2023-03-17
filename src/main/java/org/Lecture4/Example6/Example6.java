package org.Lecture4.Example6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example6 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque); // [3, 2, 1]
        deque.removeFirst();
        System.out.println(deque); // [2, 1]
        deque.removeLast();
        System.out.println(deque); // [2]
        deque.addLast(1);
        System.out.println(deque); // [2, 1]
    }
}
