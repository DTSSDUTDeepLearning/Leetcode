package NowCoder.l142;

public class l142 {

    public int solve (String a) {
        if (a == null || a.length() <= 1) {
            return 0;
        }
        char[] chars = a.toCharArray();
        int len = chars.length;
        int maxLen = chars.length / 2;
        for (int i = maxLen;i >= 1;i--){
            for (int j = 0;j <= len - 2 * i;j++){
                if (check(chars, j, i))
                    return 2 * i;
            }
        }
        return 0;
    }
    public boolean check(char[] chars, int start, int len){
        for (int i = start;i < start + len;i++){
            if (chars[i] != chars[i+len]) {
                return false;
            }
        }
        return true;
    }
}
