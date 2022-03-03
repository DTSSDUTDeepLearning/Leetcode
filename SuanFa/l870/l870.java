package SuanFa.l870;

import java.util.Arrays;

public class l870 {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        Arrays.sort(nums1);
        int[][] index2 = new int[len][2];
        for (int i = 0;i < len;i++) {
            index2[i][0] = nums2[i];
            index2[i][1] = i;
        }
        Arrays.sort(index2, (o1, o2) -> (o1[0] - o2[0]));
        int[] result = new int[len];
        int left = 0;
        int right = len - 1;
        for (int num : nums1) {
            if (num <= index2[left][0]) {
                result[index2[right--][1]] = num;
            } else {
                result[index2[left++][1]] = num;
            }
        }
        return result;
    }
}
