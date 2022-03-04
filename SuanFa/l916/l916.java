package SuanFa.l916;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l916 {

    public List<String> wordSubsets(String[] A, String[] B) {
        // 实现多个集合的相加
        Map<Character, Integer> mb_total = new HashMap<>();
        for (String b : B) {
            Map<Character, Integer> mb = stringtomap(b);
            for (char c : mb.keySet()) {
                if (!mb_total.containsKey(c) || mb.get(c) > mb_total.get(c)) {
                    mb_total.put(c, mb.get(c));
                }
            }
        }

        List<String> results = new LinkedList<>();
        for (String a : A) {
            Map<Character, Integer> ma = stringtomap(a);
            boolean flag = true;
            for (char c : mb_total.keySet()) {
                if (!(ma.containsKey(c) && ma.get(c) >= mb_total.get(c))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                results.add(a);
            }
        }
        return results;
    }

    public Map<Character, Integer> stringtomap(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        return m;
    }
}
