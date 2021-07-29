package SuanFa.l011;

public class l011 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = (right - left) * Math.min(height[left], height[right]);
        if (height[left] < height[right])
            left++;
        else
            right--;
        while (right > left) {
            int water = (right - left) * Math.min(height[left], height[right]);
            if (water > max)
                max = water;
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
