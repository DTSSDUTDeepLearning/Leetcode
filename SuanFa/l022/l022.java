package SuanFa.l022;

import java.util.ArrayList;
import java.util.List;

public class l022 {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String s, int left, int right, int max) {
        if (s.length() == max * 2) {
            ans.add(s);
            return;
        }
        if (left < max) {
            backtrack(ans, s+"(", left+1, right, max);
        }
        if (right < left) {
            backtrack(ans, s+")", left, right+1, max);
        }
    }
}
