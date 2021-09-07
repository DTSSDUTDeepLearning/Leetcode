package SuanFa.l080;

public class l080 {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }
        int slow = 2;
        for (int fast = 2;fast < len;fast++) {
            if (nums[slow-2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
