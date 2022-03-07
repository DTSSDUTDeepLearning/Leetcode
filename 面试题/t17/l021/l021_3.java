package MianShiTi.t17;

public class l021_3 {

    // 双指针
    // 1ms, 38.4MB
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int left_id = 0;
        int right_id = len-1;
        int left_max = height[left_id];
        int right_max = height[right_id];
        int water = 0;
        while (left_id < right_id) {
            if (height[left_id] < height[right_id]) {
                water+=(left_max-height[left_id]);
                left_id++;
                left_max = Math.max(left_max, height[left_id]);
            }
            else {
                water+=(right_max-height[right_id]);
                right_id--;
                right_max = Math.max(right_max, height[right_id]);
            }
        }
        return water;
    }
}
