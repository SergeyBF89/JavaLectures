package org.Lecture4.Example7;

import java.util.Stack;


public class Example7 {
    public static void main(String[] args) {
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3 = 7
        //var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3 = 9
        //var exp = "20 30 - 10 *".split(" "); // (20 - 30) * 10 = 100
        var exp = "1 2 3 * 4 + 10 5 / * 20 -".split(" "); // 20
        int res = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                stack.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+" -> {
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                    }
                    case "-" -> {
                        res = stack.pop() - stack.pop();
                        stack.push(res);
                    }
                    case "*" -> {
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                    }
                    case "/" -> {
                        res = stack.pop() / stack.pop();
                        stack.push(res);
                    }
                    default -> {
                    }
                }
            }
        }
        System.out.printf("%d\n", stack.pop());

    }

    private static boolean isDigit(String s)  throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
