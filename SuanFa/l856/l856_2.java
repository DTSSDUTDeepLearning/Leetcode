package SuanFa.l856;

public class l856_2 {

    // 只统计核心()的深度x，然后计算2^x的总和即可
    public int scoreOfParentheses(String S) {
        int result = 0;
        int depth = 0;
        char[] cs = S.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '(') {
                depth++;
            }
            else {
                depth--;
                if (cs[i-1] == '(')
                    result += 1 << depth;
            }
        }
        return result;
    }
}
