package SuanFa.l1685;

public class l1685 {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right+=num;
        }
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            right-=nums[i];
            result[i] = nums[i]*i-left+right-nums[i]*(len-i);
            left+=nums[i];
        }
        return result;
    }
}
