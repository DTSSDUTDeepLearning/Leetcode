package SuanFa.l1109;

public class l1109_2 {

    // 用新数组记录每一个下标处，人数的变化，最后再相加。这样时间复杂度超越99.16%
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] count = new int[n];
        for (int[] booking : bookings) {
            count[booking[0]-1]+=booking[2];
            if (booking[1] != n) {
                count[booking[1]] -= booking[2];
            }
        }
        for (int i = 1;i < n;i++) {
            count[i] += count[i-1];
        }
        return count;
    }
}
