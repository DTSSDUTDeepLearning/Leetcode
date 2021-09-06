package SuanFa.l030;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l030 {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new LinkedList<>();
        int word_num = words.length;
        int word_len = words[0].length();
        int s_len = s.length();
        Map<String, Integer> word_cnt = new HashMap<>();
        for (String word : words) {
            word_cnt.put(word, word_cnt.getOrDefault(word, 0) + 1);
        }
        for (int i = 0;i + word_num * word_len <= s_len;i++) {
            Map<String, Integer> tmp = new HashMap<>(word_cnt);
            boolean flag = true;
            for (int j = 0;j < word_num;j++) {
                String ifword = s.substring(i+j*word_len, i+(j+1)*word_len);
                if (!tmp.containsKey(ifword) || tmp.get(ifword) == 0) {
                    flag = false;
                    break;
                }
                else {
                    tmp.put(ifword, tmp.get(ifword)-1);
                }
            }
            if (flag) {
                result.add(i);
            }
        }
        return result;
    }
}
