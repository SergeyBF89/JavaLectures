package org.Lecture3.Example6;

import java.util.Iterator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator(); // создаем итератор
        System.out.println();
        while (col.hasNext()) { // пока есть следующий элемент
            System.out.println(col.next()); // вывод следующего элемента
            //col.next(); // Exception in thread "main" java.util.NoSuchElementException
            //col.remove(); // Exception in thread "main" java.lang.UnsupportedOperationException
        }
    }
}
