package NowCoder.l647;

import java.util.HashMap;
import java.util.Map;

public class l647 {

    public static String decode (String str, int d) {
        char[] pw = new char[62];
        for (int i = 0;i < 10;i++) {
            pw[i] = (char)('0'+i);
        }
        for (int i = 10;i < 36;i++) {
            pw[i] = (char)('A'+i-10);
        }
        for (int i = 36;i < 62;i++) {
            pw[i] = (char)('a'+i-36);
        }
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0;i < 62;i++) {
            m.put(pw[i], i);
        }
        int len = str.length();
        char[] result = str.toCharArray();
        for (int i = 0;i < len;i++) {
            char c = result[i];
            if (m.get(c) < d) {
                result[i] = pw[m.get(c)+62-d];
            }
            else {
                result[i] = pw[m.get(c)-d];
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String str1 = "123ABCabc";
        int d1 = 3;
        System.out.println(decode(str1, d1));
    }
}
