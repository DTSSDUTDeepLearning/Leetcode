package SuanFa.l349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class l349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            s2.add(num);
        }
        if (s1.size() > s2.size()) {
            return getIntersection(s2, s1);
        }
        else {
            return getIntersection(s1, s2);
        }
    }

    public static int[] getIntersection(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int num : s1) {
            if (s2.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }
}
