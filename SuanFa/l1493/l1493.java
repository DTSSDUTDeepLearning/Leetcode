package SuanFa.l1493;

public class l1493 {

    public int longestSubarray(int[] nums) {
        int a = 0;
        int b = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                b = a;
                a = 0;
            }
            else {
                a++;
                b++;
            }
            max = Math.max(a, b);
        }
        if (max == nums.length) {
            max--;
        }
        return max;
    }
}
