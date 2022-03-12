package SuanFa.l1432;

public class l1432 {

    public int maxDiff(int num) {
        if (num < 10) {
            return 8;
        }
        char[] cs = String.valueOf(num).toCharArray();
        int len = cs.length;
        int i = 0;
        while (i < len && cs[i] == '9') {
            i++;
        }
        if (i != len) {
            char c = cs[i];
            for (;i < len;i++) {
                if (cs[i] == c) {
                    cs[i] = '9';
                }
            }
        }
        int max = Integer.parseInt(String.valueOf(cs));
        cs = String.valueOf(num).toCharArray();
        if (cs[0] != '1') {
            char c = cs[0];
            for (i = 0;i < len;i++) {
                if (cs[i] == c) {
                    cs[i] = '1';
                }
            }
        }
        else {
            i = 1;
            while (i < len && (cs[i] == '0' || cs[i] == '1')) {
                i++;
            }
            if (i != len) {
                char c = cs[i];
                for (;i < len;i++) {
                    if (cs[i] == c) {
                        cs[i] = '0';
                    }
                }
            }
        }
        return max-Integer.parseInt(String.valueOf(cs));
    }
}
