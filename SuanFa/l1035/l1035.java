package SuanFa.l1035;

public class l1035 {

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] results = new int[len1][len2];
        results[0][0] = nums1[0]==nums2[0]?1:0;
        for (int j = 1;j < len2;j++) {
            if (results[0][j-1] == 1 || nums1[0] == nums2[j]) {
                results[0][j] = 1;
            }
            else {
                results[0][j] = 0;
            }
        }
        for (int i = 1;i < len1;i++) {
            if (results[i-1][0] == 1 || nums1[i] == nums2[0]) {
                results[i][0] = 1;
            }
            else {
                results[i][0] = 0;
            }
        }
        for (int i = 1;i < len1;i++) {
            for (int j = 1;j < len2;j++) {
                if (nums1[i] == nums2[j]) {
                    results[i][j] = Math.max(results[i][j-1], Math.max(results[i-1][j], results[i-1][j-1]+1));
                }
                else {
                    results[i][j] = Math.max(results[i][j-1], results[i-1][j]);
                }
            }
        }
        return results[len1-1][len2-1];
    }
}
