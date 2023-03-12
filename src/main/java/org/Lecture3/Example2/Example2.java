package org.Lecture3.Example2;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2)); // 3
        System.out.println(Sum(1.0, 2)); // 0
        System.out.println(Sum(1, 2.0)); // 0
        System.out.println(Sum(1.2, 2.1)); // 3.3
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) { // если a и b являются типом double
            return (Object) ((Double) a + (Double) b); // переменные a и b приводим к типу double и запаковываем обратно в тип Object
        }  else if (a instanceof Integer && b instanceof Integer) { // если a и b являются типом Integer
            return (Object) ((Integer) a + (Integer) b); // переменные a и b приводим к типу Integer и запаковываем обратно в тип Object
        } else return 0;
    }
}
