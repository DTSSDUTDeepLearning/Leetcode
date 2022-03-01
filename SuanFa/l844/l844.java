package SuanFa.l844;

import java.util.Deque;
import java.util.LinkedList;

public class l844 {

    public boolean backspaceCompare(String S, String T) {
        Deque<Character> s1 = new LinkedList<>();
        Deque<Character> s2 = new LinkedList<>();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                s1.push(c);
            }
            else if (!s1.isEmpty()) {
                s1.pop();
            }
        }
        for (char c : T.toCharArray()) {
            if (c != '#') {
                s2.push(c);
            }
            else if (!s2.isEmpty()) {
                s2.pop();
            }
        }
        if (s1.size() != s2.size()) {
            return false;
        }
        while (!s1.isEmpty()) {
            if (s1.pop() != s2.pop()) {
                return false;
            }
        }
        return true;
    }
}
