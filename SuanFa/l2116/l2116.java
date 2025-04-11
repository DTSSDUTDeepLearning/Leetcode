package l2116;

public class l2116 {

    public boolean canBeValid(String s, String locked) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len % 2 != 0) {
            return false;
        }
        char[] lock = locked.toCharArray();
        int left = 0;
        int change = 0;
        int right = 0;
        for (int i = 0;i < len;i++) {
            if (lock[i] == '1') {
                if (cs[i] == '(') {
                    left++;
                }
                else {
                    right++;
                }
            }
            else {
                change++;
            }
            if (left + change < right) {
                return false;
            }
        }
        left = 0;
        change = 0;
        right = 0;
        for (int i = len-1;i >= 0;i--) {
            if (lock[i] == '1') {
                if (cs[i] == '(') {
                    left++;
                }
                else {
                    right++;
                }
            }
            else {
                change++;
            }
            if (right + change < left) {
                return false;
            }
        }
        return true;
    }
}
