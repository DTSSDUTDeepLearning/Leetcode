package SuanFa.l1920;

public class l1920 {

    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
