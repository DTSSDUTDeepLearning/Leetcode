package SuanFa.l1047;

import java.util.ArrayDeque;
import java.util.Deque;

public class l1047 {

    public static String removeDuplicates(String S) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] cs = S.toCharArray();
        for (int i = 0;i < cs.length;i++) {
            if (!stack.isEmpty() && (cs[i]==stack.peek())) {
                stack.poll();
            }
            else {
                stack.push(cs[i]);
            }
        }
        int len = stack.size();
        char[] results = new char[len];
        for (int i = len-1;i >= 0;i--) {
            results[i] = stack.poll();
        }
        return new String(results);
    }

    public static void main(String[] args) {
        String s1 = "abbaca";
        String s2 = "abbabbcca";
        String s3 = "abba";
        System.out.println(removeDuplicates(s1));
        System.out.println(removeDuplicates(s2));
        System.out.println(removeDuplicates(s3));
    }
}
