package SuanFa.l704;

public class l704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid;
            }
            else {
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        return -1;
    }
}
