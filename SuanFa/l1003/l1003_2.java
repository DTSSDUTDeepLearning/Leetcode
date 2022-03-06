package SuanFa.l1003;

import java.util.Deque;
import java.util.LinkedList;

public class l1003_2 {

    // 用栈来进行消去
    public boolean isValid(String s) {
        char[] cs = s.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        for (char c : cs) {
            if (c != 'c') {
                stack.push(c);
            }
            else if (!stack.isEmpty() && stack.peek() == 'b') {
                stack.pop();
                if (!stack.isEmpty() && stack.peek() == 'a') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
