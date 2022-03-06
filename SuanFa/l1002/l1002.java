package SuanFa.l1002;

import java.util.*;

public class l1002 {

    public static List<String> commonChars(String[] A) {
        int len = A.length;
        char[] cs = A[0].toCharArray();
        Map<Character, Integer> base = new HashMap<>();
        for (char c : cs) {
            base.put(c, base.getOrDefault(c, 0)+1);
        }
        for (int i = 1;i < len;i++) {
            cs = A[i].toCharArray();
            Map<Character, Integer> m = new HashMap<>();
            for (char c : cs) {
                if (base.containsKey(c)) {
                    m.put(c, m.getOrDefault(c, 0)+1);
                }
            }
            List<Character> set = new LinkedList<>(base.keySet());
            for (char c : set) {
                if (!m.containsKey(c)) {
                    base.remove(c);
                }
                else if (base.get(c) > m.get(c)) {
                    base.put(c, m.get(c));
                }
            }
        }
        List<String> l = new LinkedList<>();
        for (char c : base.keySet()) {
            len = base.get(c);
            for (int i = 0;i < len;i++) {
                l.add(String.valueOf(c));
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String[] A1 = {"bella","label","roller"};
        System.out.println(commonChars(A1));
        String[] A2 = {"cool","lock","cook"};
        System.out.println(commonChars(A2));
    }
}
