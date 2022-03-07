package MianShiTi.t10.l002;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l002 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for (String str : strs) {
            int[] cnt = new int[26];
            for (char c : str.toCharArray()) {
                cnt[c-'a']++;
            }
            String s = array_sb(cnt);
            List<String> l = m.getOrDefault(s, new LinkedList<>());
            l.add(str);
            m.put(s, l);
        }
        return new LinkedList<>(m.values());
    }

    public String array_sb(int[] cnt) {
        StringBuilder sb = new StringBuilder();
        for (int n : cnt) {
            sb.append(n);
            sb.append(' ');
        }
        return sb.toString();
    }
}
