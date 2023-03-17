package org.Lecture4.Example3;

import java.util.LinkedList;
import java.util.Queue;

public class Example3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("John Smith");
        queue.add("Mary Brown");
        queue.add("David Filcher");

        //System.out.println(queue.element()); // John Smith
        //System.out.println(queue.remove()); // John Smith (удалили)
        //System.out.println(queue.element()); // Mary Brown

        for (String person : queue) {
            System.out.println(person);
        }
    }
}
