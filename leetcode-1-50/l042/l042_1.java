package SuanFa.l042;

public class l042_1 {

    // 使用动态规划，分别计算每个位置的左边的最大值和每个位置的右边的最大值，最后进行处理计算
    // 1ms, 38MB
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int[] leftmax = new int[len];
        int[] rightmax = new int[len];
        leftmax[0] = height[0];
        rightmax[len-1] = height[len-1];
        for (int i = 1;i < len;i++) {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        for (int i = len-2;i >= 0;i--) {
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        int water = 0;
        for (int i = 0;i < len;i++) {
            water+= Math.min(leftmax[i], rightmax[i])-height[i];
        }
        return water;
    }
}
