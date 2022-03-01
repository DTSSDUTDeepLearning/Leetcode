package SuanFa.l831;

import java.util.LinkedList;
import java.util.List;

public class l831 {

    public String maskPII(String S) {
        if (S.indexOf('@') != -1) {
            int i1 = S.indexOf('@');
            int i2 = S.indexOf('.');

            StringBuilder sb = new StringBuilder();
            char c = S.charAt(0);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c+32));
            }
            else {
                sb.append(c);
            }
            sb.append("*****");
            sb.append(S.substring(i1-1).toLowerCase());
            return sb.toString();
        }
        else {
            List<Character> l = new LinkedList<>();
            char[] cs = S.toCharArray();
            for (char c : cs) {
                if (c >= '0' && c <= '9') {
                    l.add(c);
                }
            }
            int len = l.size();
            StringBuilder sb = new StringBuilder();
            if (len == 10) {
                sb.append("***-***-");
            }
            else {
                sb.append("+");
                for (int i = 10;i < len;i++) {
                    sb.append('*');
                }
                sb.append("-***-***-");
            }
            for (int i = len-4;i < len;i++) {
                sb.append(l.get(i));
            }
            return sb.toString();
        }
    }
}
