package SuanFa.l1010;

public class l1010 {

    public int numPairsDivisibleBy60(int[] time) {
        int[] minutes = new int[60];
        for (int t : time) {
            minutes[t%60]++;
        }
        int cnt = minutes[0]*(minutes[0]-1)/2+minutes[30]*(minutes[30]-1)/2;
        for (int i = 1;i < 30;i++) {
            cnt += minutes[i]*minutes[60-i];
        }
        return cnt;
    }
}
