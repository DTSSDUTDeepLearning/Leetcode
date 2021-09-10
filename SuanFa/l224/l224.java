package SuanFa.l224;

import java.util.Deque;
import java.util.LinkedList;

public class l224 {

    public int calculate(String s) {
        int num = 0;
        Deque<Character> operation_stack = new LinkedList<>();
        Deque<Integer> num_stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                operation_stack.push('(');
                num_stack.push(num);
                num = 0;
            } else if (c == ')') {
                while (operation_stack.peek() != '(') {
                    char op = operation_stack.poll();
                    int num_before = num_stack.poll();
                    if (op == '+') {
                        num = num_before + num;
                    } else {
                        num = num_before - num;
                    }
                }
                operation_stack.poll();
                num_stack.poll();
            } else if (c == '+' || c == '-') {
                if (!operation_stack.isEmpty() && operation_stack.peek() != '(') {
                    char op = operation_stack.poll();
                    int num_before = num_stack.poll();
                    if (op == '+') {
                        num = num_before + num;
                    } else {
                        num = num_before - num;
                    }
                }
                operation_stack.push(c);
                num_stack.push(num);
                num = 0;
            } else if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            }
        }
        while (!operation_stack.isEmpty()) {
            char op = operation_stack.poll();
            int num_before = num_stack.poll();
            if (op == '+') {
                num = num_before + num;
            } else {
                num = num_before - num;
            }
        }
        return num;
    }
}
