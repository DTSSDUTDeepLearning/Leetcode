package SuanFa.l1422;

public class l1422 {

    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        int max = 0;
        char[] cs = s.toCharArray();
        int len = cs.length;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }
        for (int i = 0;i < len-1;i++) {
            if (cs[i] == '0') {
                zero++;
            }
            else {
                one--;
            }
            max = Math.max(max, zero+one);
        }
        return max;
    }
}
