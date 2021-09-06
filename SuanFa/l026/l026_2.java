package SuanFa.l026;

public class l026_2 {
    //双指针，而且一个是快指针
    public static void printYuanDiarray(int[] nums, int len) {
        for (int i = 0;i < len;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int len1 = removeDuplicates(nums1);
        int len2 = removeDuplicates(nums2);
        printYuanDiarray(nums1, len1);
        printYuanDiarray(nums2, len2);
    }
}
