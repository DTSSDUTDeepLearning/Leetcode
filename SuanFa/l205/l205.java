package SuanFa.l205;

import java.util.HashMap;
import java.util.Map;

public class l205 {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        int len = s.length();
        for (int i = 0;i < len;i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (m1.get(a) == null) {
                if (m2.get(b) == null) {
                    m1.put(a, b);
                    m2.put(b, a);
                }
                else {
                    return false;
                }
            }
            else if (m1.get(a) != b) {
                return false;
            }
            else if (m2.get(b) == null || m2.get(b) != a) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";
        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s2, t2));
        System.out.println(isIsomorphic(s3, t3));
    }
}
