package NowCoder.l026;

import java.util.ArrayList;

public class l026 {

    public ArrayList<String> generateParenthesis (int n) {
        ArrayList<String> ans = new ArrayList<String>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(ArrayList<String> ans, String s, int left, int right, int max) {
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
