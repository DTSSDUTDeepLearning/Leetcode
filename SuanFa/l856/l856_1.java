package SuanFa.l856;

import java.util.Deque;
import java.util.LinkedList;

public class l856_1 {

    // 使用栈
    public int scoreOfParentheses(String S) {
        Deque<Integer> s = new LinkedList<>();
        s.push(0);
        for (char c : S.toCharArray()) {
            if (c == '(') {
                s.push(0);
            }
            else {
                int v = s.pop();
                int w = s.pop();
                s.push(w+Math.max(2*v, 1));
            }
        }
        return s.pop();
    }
}
