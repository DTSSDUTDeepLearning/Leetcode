package SuanFa.l1190;

import java.util.Deque;
import java.util.LinkedList;

public class l1190 {

    public String reverseParentheses(String s) {
        int left = s.indexOf('(');
        if (left == -1) {
            return s;
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(left);
        while (!stack.isEmpty()) {
            left = stack.pop();
            int next_left = s.indexOf('(', left+1);
            int right = s.indexOf(')', left+1);
            if (next_left != -1 && next_left < right) {
                stack.push(next_left);
            }
            else {
                StringBuilder sb = new StringBuilder(s.substring(next_left+1, right)).reverse();
                s = s.substring(0, left) + sb + s.substring(right+1);
                stack.pop();
                next_left = s.indexOf('(', left+1);
                if (next_left != -1) {
                    stack.push(next_left);
                }
            }
        }
        return s;
    }
}
