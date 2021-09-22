package SuanFa.l709;

import java.util.Arrays;

public class l709 {

    public String toLowerCase(String str) {
        int len = str.length();
        char[] result = new char[len];
        for (int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            result[i] = (c>='A'&&c<='Z')?(char)(c+32):c;
        }
        return new String(result);
    }
}
