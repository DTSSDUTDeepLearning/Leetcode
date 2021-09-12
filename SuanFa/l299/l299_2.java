package SuanFa.l299;

public class l299_2 {

    // 一次遍历
//    执行用时：5 ms, 在所有 Java 提交中击败了63.20%的用户
//    内存消耗：38.6 MB, 在所有 Java 提交中击败了21.42%的用户
    public String getHint(String secret, String guess) {
        int cnt[] = new int[10];
        int bulls = 0;
        int cows = 0;
        char[] sec = secret.toCharArray();
        char[] gue = guess.toCharArray();
        int len = sec.length;
        for (int i = 0;i < len;i++) {
            if (sec[i] == gue[i]) {
                bulls++;
            }
            else {
                if (cnt[sec[i] - '0']++ < 0) {
                    cows++;
                }
                if (cnt[gue[i] - '0']-- > 0) {
                    cows++;
                }
            }
        }
        return bulls+"A"+cows+"B";
    }
}
