package SuanFa.l1629;

public class l1629 {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] cs = keysPressed.toCharArray();
        int len = cs.length;
        int max = releaseTimes[0];
        char max_c = cs[0];
        for (int i = 1;i < len;i++) {
            int time = releaseTimes[i]-releaseTimes[i-1];
            if (max < time) {
                max = time;
                max_c = cs[i];
            }
            else if (max == time && cs[i] > max_c) {
                max_c = cs[i];
            }
        }
        return max_c;
    }
}
