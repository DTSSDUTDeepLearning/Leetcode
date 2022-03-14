package SuanFa.l1704;

public class l1704 {

    public boolean halvesAreAlike(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length / 2;
        int left = 0;
        int right = 0;
        for (int i = 0;i < len;i++) {
            if (isVowel(cs[i])) {
                left++;
            }
        }
        for (int i = len;i < 2*len;i++) {
            if (isVowel(cs[i])) {
                right++;
            }
        }
        return left == right;
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        else {
            return false;
        }
    }
}
