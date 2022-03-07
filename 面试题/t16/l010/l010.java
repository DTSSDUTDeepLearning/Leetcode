package MianShiTi.t16.l010;

public class l010 {

    public int maxAliveYear(int[] birth, int[] death) {
        int[] cnt = new int[101];
        int len = birth.length;
        for (int i = 0;i < len;i++) {
            for (int j = birth[i];j <= death[i];j++) {
                cnt[j-1900]++;
            }
        }
        int max = cnt[0];
        int max_year = 0;
        for (int i = 1;i <= 100;i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                max_year = i;
            }
        }
        return max_year+1900;
    }
}
