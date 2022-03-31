package NowCoder.l155;

public class l155 {

    public int maxSubArrayLength (int[] nums) {
        int len = nums.length;
        int[] head = new int[len];
        int[] tail = new int[len];
        tail[0] = 1;
        for (int i = 1;i < len;i++) {
            tail[i] = nums[i] > nums[i-1] ? tail[i-1]+1 : 1;
        }
        head[len-1] = 1;
        for (int i = len-2;i >= 0;i--) {
            head[i] = nums[i] < nums[i+1] ? head[i+1]+1 : 1;
        }
        int max = Math.max(head[0], tail[len-1]);
        for (int i = 1;i < len-1;i++) {
            max = Math.max(max, Math.max(head[i], tail[i]));
            if (nums[i+1] - nums[i-1] >= 2) {
                max = Math.max(max, head[i+1]+tail[i-1]+1);
            }
        }
        return max;
    }
}
