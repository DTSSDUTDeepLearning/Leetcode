package SuanFa.l217;

import java.util.HashMap;
import java.util.Map;

public class l217 {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            if (m.containsKey(num)) {
                return true;
            }
            else {
                m.put(num, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
