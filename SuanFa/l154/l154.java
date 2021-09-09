package SuanFa.l154;

public class l154 {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            if (nums[left] < nums[mid]) {
                left = mid+1;
            }
            else if (nums[left] > nums[mid]) {
                right = mid;
                left++;
            }
            else {
                left++;
            }
            mid = left+(right-left)/2;
        }
        return nums[left];
    }
}
