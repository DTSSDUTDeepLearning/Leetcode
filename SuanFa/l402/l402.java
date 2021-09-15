package SuanFa.l402;

import java.util.Deque;
import java.util.LinkedList;

public class l402 {

    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) {
            return "0";
        }
        int remain = len - k;
        Deque<Character> s = new LinkedList<>();
        for (char c : num.toCharArray()) {
            while (k > 0 && !s.isEmpty() && s.peek() > c) {
                s.poll();
                k--;
            }
            s.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.insert(0, s.poll());
        }
        int index = 0;
        while (index < remain && sb.charAt(index) == '0') {
            index++;
        }
        if (index == remain) {
            return "0";
        }
        else {
            return sb.substring(index, remain);
        }
    }
}
