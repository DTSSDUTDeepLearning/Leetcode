package SuanFa.l1684;

import java.util.HashSet;
import java.util.Set;

public class l1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            s.add(c);
        }
        int cnt = 0;
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toCharArray()) {
                if (!s.contains(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        return cnt;
    }
}
