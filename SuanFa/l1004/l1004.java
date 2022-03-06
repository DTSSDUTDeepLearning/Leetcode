package SuanFa.l1004;

public class l1004 {

    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int left_0 = 0;
        int right_0 = 0;
        int cnt = 0;
        for (int right = 0;right < len;right++) {
            right_0+=1-nums[right];
            while (left_0 < right_0-k) {
                left_0+=1-nums[left];
                left++;
            }
            cnt = Math.max(cnt, right-left+1);
        }
        return cnt;
    }
}
