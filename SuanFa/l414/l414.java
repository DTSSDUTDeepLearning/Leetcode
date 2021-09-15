package SuanFa.l414;

public class l414 {

    public static int thirdMax(int[] nums) {
        long max1 = (long)Integer.MIN_VALUE-1;
        long max2 = (long)Integer.MIN_VALUE-1;
        long max3 = (long)Integer.MIN_VALUE-1;
        for (int num : nums) {
            if (num != max1 && num != max2) {
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
        }
        if (max3 == (long)Integer.MIN_VALUE-1) {
            return (int)max1;
        }
        else {
            return (int)max3;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 4, 5, 6, 7};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};
        int[] nums4 = {1, 2, 2, 5, 3, 5};
        int[] nums5 = {1, 2, -2147483648};
        System.out.println(thirdMax(nums1));
        System.out.println(thirdMax(nums2));
        System.out.println(thirdMax(nums3));
        System.out.println(thirdMax(nums4));
        System.out.println(thirdMax(nums5));
    }
}
