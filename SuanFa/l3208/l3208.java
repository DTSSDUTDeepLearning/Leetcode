package l3208;

public class l3208 {

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int cnt = 1;
        int result = 0;
        for (int i = -k+2;i < n;i++) {
            if (colors[(i+n)%n] != colors[(i-1+n)%n]) {
                cnt++;
                if (cnt >= k) {
                    result++;
                }
            }
            else {
                cnt = 1;
            }
        }
        return result;
    }
}