package SuanFa.l884;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l884 {

    public String[] uncommonFromSentences(String A, String B) {
        String C = A+" "+B;
        String[] splited = C.split(" ");
        Map<String, Integer> m = new HashMap<>();
        for (String s : splited) {
            m.put(s, m.getOrDefault(s, 0)+1);
        }
        int len = m.size();
        List<String> l = new LinkedList<>();
        for (String s : m.keySet()) {
            if (m.get(s) == 1) {
                l.add(s);
            }
        }
        int len_ = l.size();
        String[] results = new String[len_];
        for (int i = 0;i < len_;i++) {
            results[i] = l.get(i);
        }
        return results;
    }
}
