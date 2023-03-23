package org.Lecture6.Example4;

import org.Lecture6.Example4.model.Worker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1000, 100, "Алексей", "Иванов");
        Worker worker2 = new Worker(2000, 200, "Иван", "Петров");
        Worker worker3 = new Worker(300, 500, "Сергей", "Николаев");
        Worker worker4 = new Worker(1, 1000, "Владимир", "Путин");
        Worker worker5 = new Worker(300, 500, "Сергей", "Николаев");
        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(worker4);
        System.out.println(worker5);
        Set<Worker> workers = new HashSet<>(Arrays.asList(worker1, worker2, worker3, worker4, worker5));
        System.out.println(workers);

    }
}
