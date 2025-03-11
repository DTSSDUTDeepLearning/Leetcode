package l1144;

public class l1144 {

    public int movesToMakeZigzag(int[] nums) {
        return Math.min(Zigzag(nums, 0), Zigzag(nums, 1));
    }

    public int Zigzag(int[] nums, int pos) {
        int result = 0;
        for (int i = pos;i < nums.length;i+=2) {
            int x = 0;
            if (i-1 >= 0) {
                x = Math.max(x, nums[i]-nums[i-1]+1);
            }
            if (i+1 < nums.length) {
                x = Math.max(x, nums[i]-nums[i+1]+1);
            }
            result += x;
        }
        return result;
    }
}
