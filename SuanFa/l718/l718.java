package SuanFa.l718;

public class l718 {

    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] result = new int[m][n];
        int max = 0;
        for (int j = 0;j < n;j++) {
            result[0][j] = nums1[0] == nums2[j] ? 1 : 0;
            max = Math.max(max, result[0][j]);
        }
        for (int i = 1;i < m;i++) {
            result[i][0] = nums1[i] == nums2[0] ? 1 : 0;
            max = Math.max(max, result[i][0]);
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                result[i][j] = nums1[i] == nums2[j] ? result[i-1][j-1] + 1 : 0;
                max = Math.max(max, result[i][j]);
            }
        }
        return max;
    }
}
