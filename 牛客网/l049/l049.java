package NowCoder.l049;

public class l049 {

    public int longestValidParentheses (String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int left = 0;
        int right = 0;
        int max = 0;
        for (char c : cs) {
            if (c == '(') {
                left++;
            }
            else {
                right++;
                if (left == right) {
                    max = Math.max(max, 2 * left);
                }
                else if (left < right) {
                    left = right = 0;
                }
            }
        }
        left = right = 0;
        for (int i = len-1;i >= 0;i--) {
            if (cs[i] == ')') {
                right++;
            }
            else {
                left++;
                if (left == right) {
                    max = Math.max(max, 2 * left);
                }
                else if (left > right) {
                    left = right = 0;
                }
            }
        }
        return max;
    }
}
