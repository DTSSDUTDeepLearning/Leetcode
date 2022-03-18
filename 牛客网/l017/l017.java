package NowCoder.l017;

public class l017 {

    public int getLongestPalindrome(String A, int n) {
        char[] cs = A.toCharArray();
        int max = 1;
        for (int i = 1;i < n-1;i++) {
            max = Math.max(Math.max(max, kuozhan(cs, i, i)), kuozhan(cs, i, i+1));
        }
        return max;
    }

    public int kuozhan(char[] cs, int left, int right) {
        while (left >= 0 && right < cs.length && cs[left]==cs[right]) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
