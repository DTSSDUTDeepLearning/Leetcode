package SuanFa.l1717;

import java.util.Deque;
import java.util.LinkedList;

public class l1217 {

    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            StringBuilder sb = new StringBuilder(s);
            return maximumGain(sb.reverse().toString(), y, x);
        }
        int sum = 0;
        Deque<Character> stack1 = new LinkedList<>();
        Deque<Character> stack2 = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (!stack1.isEmpty() && stack1.peek() == 'a' && c == 'b') {
                sum+=x;
                stack1.pop();
            }
            else {
                stack1.push(c);
            }
        }
        while (!stack1.isEmpty()) {
            char c = stack1.poll();
            if (c == 'b' && !stack2.isEmpty() && stack2.peek() == 'a') {
                sum+=y;
                stack2.pop();
            }
            else {
                stack2.push(c);
            }
        }
        return sum;
    }
}
