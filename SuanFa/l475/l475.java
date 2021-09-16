package SuanFa.l475;

import java.util.Arrays;

public class l475 {

    int[] houses;
    int[] heaters;
    int houses_len;
    int heaters_len;

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        this.houses = houses;
        houses_len = this.houses.length;
        this.heaters = heaters;
        heaters_len = this.heaters.length;
        int left = 0;
        int right = Math.max(heaters[heaters_len-1] - houses[0], houses[houses_len-1] - heaters[0]);
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (check(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }

    public boolean check(int radius) {
        int i = 0;
        for (int j = 0;j < houses_len;j++) {
            while (i < heaters_len && (houses[j] < heaters[i] - radius || houses[j] > heaters[i] + radius)) {
                i++;
            }
            if (i == heaters_len) {
                return false;
            }
        }
        return true;
    }
}
