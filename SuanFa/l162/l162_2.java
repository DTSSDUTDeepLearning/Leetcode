package SuanFa.l162;

public class l162_2 {

//    二分
//    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.2 MB, 在所有 Java 提交中击败了30.76%的用户
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1 || nums[0] > nums[1]) {
            return 0;
        }
        if (nums[len-1] > nums[len-2]) {
            return len-1;
        }
        int left = 1;
        int right = len-2;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (nums[mid] < nums[mid-1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
