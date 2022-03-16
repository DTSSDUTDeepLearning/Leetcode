package SuanFa.l1855;

public class l1855 {

    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int max = 0;
        for (int j = 0;j < len2;j++) {
            while (i < len1-1 && i <= j && nums1[i] > nums2[j]) {
                i++;
            }
            if (nums1[i] <= nums2[j]) {
                max = Math.max(max, j-i);
            }
        }
        return max;
    }
}
