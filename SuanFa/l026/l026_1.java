package SuanFa.l026;

public class l026_1 {
    //双指针，但我又有一次画蛇添足了，把相同的元素放到了后面，其实这一步根本不用，直接替换就行
    public static void printYuanDiarray(int[] nums, int len) {
        for (int i = 0;i < len;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = 1;
        while (i < len-1) {
            if (nums[i+1]==nums[i]) {
                for (int k = i;k < len-1;k++) {
                    int tmp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = tmp;
                }
                len--;
            }
            else {
                i++;
                j++;
            }
        }
        return j;
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
