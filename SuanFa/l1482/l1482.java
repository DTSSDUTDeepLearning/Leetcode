package SuanFa.l1482;

public class l1482 {

    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        if (len < m*k) {
            return -1;
        }
        int left = 1;
        int right = 1000000000;
        int mid = left + (right-left)/2;
        while (left <= right) {
            if (ifplant(bloomDay, m, k, mid)) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid = left + (right-left)/2;
        }
        return left;
    }

    public static boolean ifplant(int[] bloomDay, int m, int k, int t) {
        int len = bloomDay.length;
        int i = 0;
        int num = 0;
        while (i+k <= len && num < m) {
            while (i+k <= len && bloomDay[i] > t) {
                i++;
            }
            if (i+k > len) {
                return false;
            }
            int j = i+1;
            for (;j < i+k;j++) {
                if (bloomDay[j] > t) {
                    break;
                }
            }
            if (j == i+k) {
                i+=k;
                num++;
            }
            else {
                i = j+1;
            }
        }
        return num == m;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int t = 3;
        System.out.println(ifplant(bloomDay, m, k, 3));
        System.out.println(ifplant(bloomDay, m, k, 2));
    }
}
