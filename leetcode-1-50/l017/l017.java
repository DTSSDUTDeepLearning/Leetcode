package SuanFa.l017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l017 {

    Map<String, String> rela = new HashMap() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> ans = new ArrayList<>();

    public void backtrack(String ans_str, String digit_left) {
        if (digit_left.length() == 0) {
            ans.add(ans_str);
        } else {
            String digit = digit_left.substring(0,1);
            String letters = rela.get(digit);
            for (int i = 0;i < letters.length();i++) {
                String letter = letters.substring(i,i+1);
                backtrack(ans_str+letter, digit_left.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return ans;
    }
}
