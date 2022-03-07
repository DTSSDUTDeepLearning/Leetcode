package MianShiTi.t16.l002;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequency {

    Map<String, Integer> m;

    public WordsFrequency(String[] book) {
        m = new HashMap<>();
        for (String b : book) {
            m.put(b, m.getOrDefault(b, 0)+1);
        }
    }

    public int get(String word) {
        return m.getOrDefault(word, 0);
    }
}
