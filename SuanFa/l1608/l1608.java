package SuanFa.l1608;

public class l1608 {

    public int specialArray(int[] nums) {
        int max = -1;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] cnt = new int[max+1];
        for (int num : nums) {
            cnt[num]++;
        }
        int left = 0;
        int right = max;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            int big_cnt = 0;
            for (int i = mid;i <= max;i++) {
                big_cnt+=cnt[i];
            }
            if (big_cnt == mid) {
                return mid;
            }
            else if (big_cnt < mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}
