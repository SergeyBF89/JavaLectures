package org.Lecture4.Example4;

import java.util.Deque;
import java.util.LinkedList;

public class Example4 {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //System.out.println(stack.peek()); // 3
        //System.out.println(stack.pop()); // 3 (удалили)
        //System.out.println(stack.peek()); // 2

        for (Integer num : stack) {
            System.out.println(num); // 3 2 1
        }
    }
}
