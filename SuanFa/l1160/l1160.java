package SuanFa.l1160;

import java.util.HashMap;
import java.util.Map;

public class l1160 {

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> m = getMap(chars);
        int cntlen = 0;
        for (String word : words) {
            Map<Character, Integer> tmp = getMap(word);
            boolean flag = true;
            for (char c : tmp.keySet()) {
                if (!m.containsKey(c) || m.get(c) < tmp.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cntlen+=word.length();
            }
        }
        return cntlen;
    }

    public Map<Character, Integer> getMap(String word) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : word.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        return m;
    }
}
