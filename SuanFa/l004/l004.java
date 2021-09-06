package SuanFa.l004;

public class l004 {

    public static double findkth(int[] nums1, int[] nums2, int k) {
        int pos1 = -1;
        int pos2 = -1;
        while (true) {
            if (nums1.length == pos1+1) {
                return nums2[pos2+k];
            }
            if (nums2.length == pos2+1) {
                return nums1[pos1+k];
            }
            // 这里的顺序有讲究，如果将上面两个判断，和下面这一个判断掉个位置，会报越界错误
            if (k == 1) {
                return Math.min(nums1[pos1+1], nums2[pos2+1]);
            }


            int delete = k/2;
            if (pos1 + delete > nums1.length-1) {
                delete = nums1.length-pos1-1;
            }
            if (pos2 + delete > nums2.length-1) {
                delete = nums2.length-pos2-1;
            }

            if (nums1[pos1+delete] <= nums2[pos2+delete]) {
                pos1 += delete;
            }
            else {
                pos2 += delete;
            }
            k -= delete;
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0.0;
        }
        if (nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                return (nums2[nums2.length/2] + nums2[nums2.length/2-1]) / 2.0;
            }
            else {
                return nums2[nums2.length/2];
            }
        }
        if (nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                return (nums1[nums1.length/2] + nums1[nums1.length/2-1]) / 2.0;
            }
            else {
                return nums1[nums1.length/2];
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (findkth(nums1, nums2, (nums1.length + nums2.length)/2) + findkth(nums1, nums2, (nums1.length + nums2.length)/2+1)) / 2.0;
        }
        else {
            return (findkth(nums1, nums2, (nums1.length + nums2.length)/2+1));
        }
    }

    public static void main(String[] args) {
        int[] nums11 = {1,3};
        int[] nums21 = {2};
        System.out.println(findMedianSortedArrays(nums11, nums21));
        int[] nums12 = {1,2};
        int[] nums22 = {3,4};
        System.out.println(findMedianSortedArrays(nums12, nums22));
        int[] nums13 = {0,0};
        int[] nums23 = {0};
        System.out.println(findMedianSortedArrays(nums13, nums23));
        int[] nums14 = {};
        int[] nums24 = {1};
        System.out.println(findMedianSortedArrays(nums14, nums24));
        int[] nums15 = {2};
        int[] nums25 = {};
        System.out.println(findMedianSortedArrays(nums15, nums25));
        int[] nums16 = {1};
        int[] nums26 = {2,3,4,5,6};
        System.out.println(findMedianSortedArrays(nums16, nums26));
    }
}
