package SuanFa.l316;

import java.util.Deque;
import java.util.LinkedList;

public class l316 {

    public String removeDuplicateLetters(String s) {
        boolean[] flag = new boolean[26]; // 在当前栈中是否出现过
        int[] cnt = new int[26]; // 还有几个在没被遍历过的剩余字符串中
        for (char c : s.toCharArray()) {
            cnt[c-'a']++;
        }
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (!flag[c-'a']) {
                while (!stack.isEmpty() && stack.peek() > c && cnt[stack.peek()-'a'] > 0) {
                    flag[stack.peek()-'a'] = false;
                    stack.poll();
                }
                flag[c-'a'] = true;
                stack.push(c);
            }
            cnt[c-'a']--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.poll());
        }
        return sb.toString();
    }
}
