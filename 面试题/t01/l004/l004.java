package MianShiTi.t01.l004;

public class l004 {

    public boolean canPermutePalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) {
            cnt[c]++;
        }
        boolean flag = true;
        for (int i = 0;i < 128;i++) {
            if (cnt[i] % 2 == 1) {
                if (flag) {
                    flag = false;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
