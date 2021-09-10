package SuanFa.l227;

import java.util.Deque;
import java.util.LinkedList;

public class l227 {

    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        char preOp = '+';
        int num = 0;
        char[] cs = s.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len-1;i++) {
            if (cs[i] >= '0' && cs[i] <= '9') {
                num = num * 10 + cs[i] - '0';
            }
            else if (cs[i] != ' ') {
                if (preOp == '+') {
                    stack.push(num);
                }
                else if (preOp == '-') {
                    stack.push(-num);
                }
                else if (preOp == '*') {
                    stack.push(stack.poll() * num);
                }
                else {
                    stack.push(stack.poll() / num);
                }
                preOp = cs[i];
                num = 0;
            }
        }
        if (cs[len-1] >= '0' && cs[len-1] <= '9') {
            num = num * 10 + cs[len-1] - '0';
        }
        if (preOp == '+') {
            stack.push(num);
        }
        else if (preOp == '-') {
            stack.push(-num);
        }
        else if (preOp == '*') {
            stack.push(stack.poll() * num);
        }
        else {
            stack.push(stack.poll() / num);
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.poll();
        }
        return result;
    }

}
