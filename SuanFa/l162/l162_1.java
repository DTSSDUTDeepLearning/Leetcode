package SuanFa.l162;

public class l162_1 {

//    遍历
//    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.1 MB, 在所有 Java 提交中击败了32.89%的用户
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1 || nums[0] > nums[1]) {
            return 0;
        }
        if (nums[len-1] > nums[len-2]) {
            return len-1;
        }
        for (int i = 0;i < len-1;i++) {
            if (nums[i] > nums[i+1]) {
                return i;
            }
        }
        return len-1;
    }
}
