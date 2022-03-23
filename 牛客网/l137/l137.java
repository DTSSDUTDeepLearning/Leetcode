package NowCoder.l137;

import java.util.Deque;
import java.util.LinkedList;

public class l137 {

    public int solve (String s) {
        Deque<Integer> stack = new LinkedList<>();
        char[] cs = s.toCharArray();
        int len = cs.length;
        int number = 0;
        char sign = '+';
        for (int i = 0;i < len;i++) {
            char c = cs[i];
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            }
            if (c == '(') {
                int left_index = ++i;
                int kuohao_sub = 1;
                while (kuohao_sub > 0) {
                    if (cs[i] == '(') {
                        kuohao_sub++;
                    }
                    if (cs[i] == ')') {
                        kuohao_sub--;
                    }
                    i++;
                }
                number = solve(s.substring(left_index, --i));
            }
            if (!Character.isDigit(c) || i == len-1) {
                if (sign == '+') {
                    stack.push(number);
                }
                else if (sign == '-') {
                    stack.push(-1 * number);
                }
                else if (sign == '*') {
                    stack.push(stack.pop() * number);
                }
                else if (sign == '/') {
                    stack.push(stack.pop() / number);
                }
                number = 0;
                sign = c;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
