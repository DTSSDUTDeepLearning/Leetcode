package SuanFa.l451;

import java.util.*;

public class l451 {

    public String frequencySort(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        List<Map.Entry<Character, Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : l) {
            char c = e.getKey();
            for (int i = 0;i < e.getValue();i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
