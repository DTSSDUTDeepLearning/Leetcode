package SuanFa.l1758;

public class l1758 {

    public int minOperations(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0;i < len;i++) {
            if (i % 2 == 0) {
                if (cs[i] == '0') {
                    n2++;
                }
                else {
                    n1++;
                }
            }
            else {
                if (cs[i] == '0') {
                    n1++;
                }
                else {
                    n2++;
                }
            }
        }
        return Math.min(n1, n2);
    }
}
