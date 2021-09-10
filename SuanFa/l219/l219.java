package SuanFa.l219;

import java.util.HashMap;
import java.util.Map;

public class l219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        for (int i = 0;i < len;i++) {
            if (m.containsKey(nums[i])) {
                int index = m.get(nums[i]);
                if (i-index <= k) {
                    return true;
                }
                else {
                    m.put(nums[i], i);
                }
            }
            else {
                m.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums1, k1));
        System.out.println(containsNearbyDuplicate(nums2, k2));
        System.out.println(containsNearbyDuplicate(nums3, k3));
    }
}
