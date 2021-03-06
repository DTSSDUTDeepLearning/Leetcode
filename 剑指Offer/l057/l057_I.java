package JianZhiOffer.l057;

public class l057_I {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            }
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{};
    }
}
