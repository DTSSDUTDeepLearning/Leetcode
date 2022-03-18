package SuanFa.l1935;

import java.util.HashSet;
import java.util.Set;

public class l1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        char[] bs = brokenLetters.toCharArray();
        Set<Character> s = new HashSet<>();
        for (char c : bs) {
            s.add(c);
        }
        String[] words = text.split(" ");
        int cnt = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (s.contains(c)) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
