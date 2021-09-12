package SuanFa.l299;

public class l299_1 {

    // 两次遍历
//    执行用时：6 ms, 在所有 Java 提交中击败了45.60%的用户
//    内存消耗：38.5 MB, 在所有 Java 提交中击败了45.92%的用户
    public String getHint(String secret, String guess) {
        int[] cntS = new int[10];
        int[] cntG = new int[10];
        char[] sec = secret.toCharArray();
        char[] gue = guess.toCharArray();
        int len = sec.length;
        int bulls = 0;
        int cows = 0;
        for (int i = 0;i < len;i++) {
            if (sec[i] == gue[i]) {
                bulls++;
            }
            else {
                cntS[sec[i] - '0']++;
                cntG[gue[i] - '0']++;
            }
        }
        for (int i = 0;i <= 9;i++) {
            cows += Math.min(cntS[i], cntG[i]);
        }
        return bulls+"A"+cows+"B";
    }
}
