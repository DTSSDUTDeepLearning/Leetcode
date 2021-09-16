package SuanFa.l500;

import java.util.LinkedList;
import java.util.List;

public class l500 {

    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        List<String> results = new LinkedList<>();
        for (String word : words) {
            char c = word.charAt(0);
            int row = 0;
            for (;row < 3;row++) {
                if (rows[row].indexOf(c) != -1) {
                    break;
                };
            }
            if (row == 3) {
                continue;
            }
            int len = word.length();
            boolean flag = true;
            for (int i = 1;i < len;i++) {
                c = word.charAt(i);
                if (rows[row].indexOf(c) == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                results.add(word);
            }
        }
        String[] r = new String[results.size()];
        results.toArray(r);
        return r;
    }
}
