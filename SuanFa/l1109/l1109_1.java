package SuanFa.l1109;

public class l1109_1 {

    // 正常顺序模拟，时间复杂度只能超越5%的提交记录
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] results = new int[n];
        for (int[] booking : bookings) {
            for (int i = booking[0];i <= booking[1];i++) {
                results[i-1] += booking[2];
            }
        }
        return results;
    }
}
