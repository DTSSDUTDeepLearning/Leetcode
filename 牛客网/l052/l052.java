package NowCoder.l052;

import java.util.ArrayDeque;
import java.util.Deque;

public class l052 {

    public boolean isValid (String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty() || c == ')' && stack.peek()!='(' || c == ']' && stack.peek()!='[' || c == '}' && stack.peek()!='{') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
