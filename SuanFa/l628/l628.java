package SuanFa.l628;

public class l628 {

    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 = num;
            }
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {-1,2,-3,-4,5,6};
        System.out.println(maximumProduct(nums1));
        System.out.println(maximumProduct(nums2));
        System.out.println(maximumProduct(nums3));
    }
}
