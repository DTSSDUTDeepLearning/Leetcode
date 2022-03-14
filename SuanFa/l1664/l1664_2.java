package SuanFa.l1664;

public class l1664_2 {

    // 直接用两个数来表示左右下标为奇数的元素总和、左右下标为偶数的元素总和，但是在具体计算过程中，两者会互相交换意义
    public int waysToMakeFair(int[] nums) {
        int len = nums.length;
        int odd_sum = 0;
        int even_sum = 0;
        for (int i = 0;i < len;i++) {
            if (i % 2 == 1) {
                odd_sum+=nums[i];
            }
            else {
                even_sum+=nums[i];
            }
        }
        int cnt = 0;
        even_sum -= nums[0];
        if (even_sum == odd_sum) {
            cnt++;
        }
        for (int i = 1;i < len;i++) {
            if (i % 2 == 1) {
                odd_sum-=nums[i];
                odd_sum+=nums[i-1];
            }
            else {
                even_sum+=nums[i-1];
                even_sum-=nums[i];
            }
            if (even_sum == odd_sum) {
                cnt++;
            }
        }
        return cnt;
    }
}
