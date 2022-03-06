package SuanFa.l1011;

public class l1011 {

    public int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = Integer.MAX_VALUE;
        int mid = left+(right-left)/2;
        while (left <= right) {
            if (ifcan(weights, D, mid)) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            mid = left+(right-left)/2;
        }
        return left;
    }

    public boolean ifcan(int[] weights, int D, int k) {
        int len = weights.length;
        int d = 0;
        int start = 0;
        while (d <= D && start < len) {
            int sum = 0;
            while (start < len && sum+weights[start] < k) {
                sum+=weights[start++];
            }
            d++;
        }
        return d <= D;
    }
}
