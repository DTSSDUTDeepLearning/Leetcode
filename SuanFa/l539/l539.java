package SuanFa.l539;

import java.util.Arrays;
import java.util.List;

public class l539 {

    public static int minute(String s) {
        return Integer.valueOf(s.substring(0,2))*60+Integer.valueOf(s.substring(3));
    }

    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
        int[] minutes = new int[len];
        for (int i = 0;i < len;i++) {
            minutes[i] = minute(timePoints.get(i));
        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < len-1;i++) {
            if (minutes[i+1] == minutes[i]) {
                return 0;
            }
            if (minutes[i+1]-minutes[i] < min) {
                min = minutes[i+1]-minutes[i];
            }
        }
        if (minutes[0]+1440-minutes[len-1] < min) {
            min = minutes[0]+1440-minutes[len-1];
        }
        return min;
    }
}
