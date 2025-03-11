package l2024;

public class l2024 {
    char[] cs;
    int k;
    int len;

    public int maxConsecutiveAnswers(String answerKey, int k) {
        cs = answerKey.toCharArray();
        this.k = k;
        len = cs.length;
        return Math.max(maxTF('T'), maxTF('F'));
    }

    public int maxTF(char c) {
        int left = 0;
        int left_sum = 0;
        int right_sum = 0;
        int cnt = 0;
        for (int right = 0;right < len;right++) {
            if (cs[right] != c) {
                right_sum++;
            }
            while (left_sum < right_sum -k) {
                if (cs[left] != c) {
                    left_sum++;
                }
                left++;
            }
            cnt = Math.max(cnt, right - left + 1);
        }
        return cnt;
    }
}