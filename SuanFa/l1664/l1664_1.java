package SuanFa.l1664;

public class l1664_1 {

    // 用数组来存储左边下标为奇数的元素和、左边下标为偶数的元素和、右边下标为奇数的元素和、右边下标为偶数的元素和
    public int waysToMakeFair(int[] nums) {
        int len = nums.length;
        int odd_sum = 0;
        int even_sum = 0;
        int[] left_odd = new int[len/2];
        int[] left_even = new int[(len+1)/2];
        int[] right_odd = new int[len/2];
        int[] right_even = new int[(len+1)/2];
        for (int i = 0;i < len;i++) {
            left_odd[i] = odd_sum;
            left_even[i] = even_sum;
            if (i % 2 == 1) {
                odd_sum+=nums[i];
            }
            else {
                even_sum+=nums[i];
            }
        }
        odd_sum = 0;
        even_sum = 0;
        int cnt = 0;
        for (int i = len-1;i >= 0;i--) {
            right_odd[i] = odd_sum;
            right_even[i] = even_sum;
            if (left_odd[i] + right_even[i] == left_even[i] + right_odd[i]) {
                cnt++;
            }
            if (i % 2 == 1) {
                odd_sum+=nums[i];
            }
            else {
                even_sum+=nums[i];
            }
        }
        return cnt;
    }
}
