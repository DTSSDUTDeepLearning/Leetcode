package SuanFa.l032;

import java.util.Deque;
import java.util.LinkedList;

public class l032_2 {

    // 双指针
//    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.6 MB, 在所有 Java 提交中击败了30.59%的用户
    public int longestValidParentheses(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int max = 0;
        int left = 0;
        int right = 0;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '(') {
                left++;
            }
            else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * left);
            }
            if (right > left) {
                left = right = 0;
            }
        }
        left = 0;
        right = 0;
        for (int i = len-1;i >= 0;i--) {
            if (cs[i] == '(') {
                left++;
            }
            else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * left);
            }
            if (right < left) {
                left = right = 0;
            }
        }
        return max;
    }
}
