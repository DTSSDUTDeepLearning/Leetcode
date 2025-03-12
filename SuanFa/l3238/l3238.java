package l3238;

public class l3238 {

    public int winningPlayerCount(int n, int[][] pick) {
        int[][] cnt = new int[n][11];
        for (int[] p : pick) {
            cnt[p[0]][p[1]]++;
        }
        int result = 0;
        for (int i = 0;i < n;i++) {
            int[] cnt_person = cnt[i];
            for (int cnt_num : cnt_person) {
                if (cnt_num > i) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}