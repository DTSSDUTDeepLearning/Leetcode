package SuanFa.l1365;

public class l1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt = new int[101];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1;i <= 100;i++) {
            cnt[i]+=cnt[i-1];
        }
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            if (nums[i] != 0) {
                nums[i] = cnt[nums[i]-1];
            }
        }
        return nums;
    }
}
