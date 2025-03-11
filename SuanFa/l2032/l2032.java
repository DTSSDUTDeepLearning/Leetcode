package l2032;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class l2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> result_set = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            if (s1.contains(num)) {
                result_set.add(num);
            }
            s2.add(num);
        }
        for (int num : nums3) {
            if (s1.contains(num)) {
                result_set.add(num);
            }
            else if (s2.contains(num)) {
                result_set.add(num);
            }
        }
        List<Integer> result_list = new LinkedList<>();
        for (int num : result_set) {
            result_list.add(num);
        }
        return result_list;
    }
}