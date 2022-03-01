package SuanFa.l819;

import java.util.*;

public class l819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String ban : banned) {
            set.add(ban);
        }
        char[] cs = paragraph.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<String> splited = new LinkedList<>();
        for (char c : cs) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            }
            else if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c+32));
            }
            else if (!sb.toString().equals("")) {
                splited.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        char c = cs[cs.length-1];
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            splited.add(sb.toString());
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : splited) {
            if (!set.contains(s)) {
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        String max = "";
        int max_cnt = -1;
        for (String k : map.keySet()) {
            if (map.get(k) > max_cnt) {
                max = k;
                max_cnt = map.get(k);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String p = "Bob. hIt, baLl";
        String[] hit = {"bob", "hit"};
        System.out.println(mostCommonWord(p, hit));
    }
}
