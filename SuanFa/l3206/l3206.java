package l3206;

public class l3206 {

    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int cnt = (colors[0] != colors[1] && colors[0] != colors[n-1]) ? 1 : 0;
        cnt += (colors[0] != colors[n-1] && colors[n-2] != colors[n-1]) ? 1 : 0;
        for (int i = 1;i < n-1;i++) {
            if (colors[i-1] != colors[i] && colors[i] != colors[i+1]) {
                cnt++;
            }
        }
        return cnt;
    }
}