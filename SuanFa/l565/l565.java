package SuanFa.l565;

public class l565 {

    public int arrayNesting(int[] nums) {
        int max = 0;
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                int start = nums[i];
                int cnt = 0;
                while (nums[start] != Integer.MAX_VALUE) {
                    int tmp = start;
                    start = nums[start];
                    nums[tmp] = Integer.MAX_VALUE;
                    cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
