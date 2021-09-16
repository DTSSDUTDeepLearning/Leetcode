package SuanFa.l496;

public class l496 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total_time = 0;
        int len = timeSeries.length;
        if (len == 0) {
            return 0;
        }
        int last = 0;
        for (int i = 1;i < len;i++) {
            if (timeSeries[i]-timeSeries[i-1] >= duration) {
                total_time+=(timeSeries[i-1]-timeSeries[last]+duration);
                last = i;
            }
        }
        return total_time+(timeSeries[len-1]-timeSeries[last]+duration);
    }
}
