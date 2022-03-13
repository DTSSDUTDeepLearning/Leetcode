package SuanFa.l1592;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1592 {

    public String reorderSpaces(String text) {
        char[] cs = text.toCharArray();
        int len = cs.length;
        List<String> l = new LinkedList<>();
        int i = 0;
        while (i < len && cs[i] == ' ') {
            i++;
        }
        int blank_cnt = i;
        while (i < len) {
            int j = i;
            while (i < len && cs[i] != ' ') {
                i++;
            }
            l.add(text.substring(j, i));
            j = i;
            while (i < len && cs[i] == ' ') {
                i++;
            }
            blank_cnt+=i-j;
        }
        int word_num = l.size();
        if (word_num == 1) {
            StringBuilder sb = new StringBuilder(l.get(0));
            for (i = 0;i < blank_cnt;i++) {
                sb.append(' ');
            }
            return sb.toString();
        }
        else {
            int blank_num = blank_cnt/(word_num-1);
            StringBuilder sb = new StringBuilder(l.get(0));
            for (i = 1;i < word_num;i++) {
                for (int j = 0;j < blank_num;j++) {
                    sb.append(' ');
                }
                sb.append(l.get(i));
            }
            for (i = 0;i < blank_cnt%(word_num-1);i++) {
                sb.append(' ');
            }
            return sb.toString();
        }
    }
}
