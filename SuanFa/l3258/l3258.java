package l3258;

public class l3258 {

    public int countKConstraintSubstrings(String s, int k) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int zero = 0;
        int one = 0;
        int result = 0;
        for (int i = 0, j = 0;j < n;j++) {
            if (cs[j] == '0') {
                zero++;
            }
            else {
                one++;
            }
            while (zero > k && one > k) {
                if (cs[i] == '0') {
                    zero--;
                }
                else {
                    one--;
                }
                i++;
            }
            result += (j-i+1);
        }
        return result;
    }
}