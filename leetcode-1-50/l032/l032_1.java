package SuanFa.l032;

import java.util.Deque;
import java.util.LinkedList;

public class l032_1 {

    //栈
//    执行用时：3 ms, 在所有 Java 提交中击败了44.48%的用户
//    内存消耗：38.3 MB, 在所有 Java 提交中击败了78.92%的用户
    public int longestValidParentheses(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    max = Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
}
