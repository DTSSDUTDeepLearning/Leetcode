package l2012;

public class l2012 {

    public int sumOfBeauties(int[] nums) {
        int len = nums.length;
        int[] leftMax = new int[len];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1;i < len-1;i++) {
            leftMax[i] = Math.max(leftMax[i-1], nums[i-1]);
        }

        int[] rightMin = new int[len];
        rightMin[len-1] = Integer.MAX_VALUE;
        for (int i = len-2;i > 0;i--) {
            rightMin[i] = Math.min(rightMin[i+1], nums[i+1]);
        }

        int sum = 0;
        for (int i = 1;i < len-1;i++) {
            if (leftMax[i] < nums[i] && nums[i] < rightMin[i]) {
                sum += 2;
            }
            else if (nums[i-1] < nums[i] && nums[i] < nums[i+1]) {
                sum++;
            }
        }
        return sum;
    }
}
