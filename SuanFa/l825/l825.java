package SuanFa.l825;

public class l825 {

    public int numFriendRequests(int[] ages) {
        int[] num = new int[121];
        for (int age: ages) {
            num[age]++;
        }
        int cnt = 0;
        for (int i = 0; i <= 120; i++) {
            for (int j = 0; j <= 120; j++) {
                if (!(j <= 0.5*i+7 || j > i || j > 100 && i < 100)) {
                    cnt+=(num[i]*num[j]);
                    if (i == j) {
                        cnt-=num[i];
                    }
                }
            }
        }
        return cnt;
    }
}
