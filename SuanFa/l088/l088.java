package SuanFa.l088;

public class l088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k--] = nums2[j--];
            }
            else {
                nums1[k--] = nums1[i--];
            }
        }
        if (i < 0) {
            for (int l = 0;l <= j;l++) {
                nums1[l] = nums2[l];
            }
        }
    }
}
