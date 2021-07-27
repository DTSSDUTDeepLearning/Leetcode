package JianZhiOffer.l021;

import JianZhiOffer.l018.ListNode;

public class l021 {

    public static void printArray(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        boolean leftflag;
        boolean rightflag;
        while (left < right) {
            leftflag = false;
            rightflag = false;
            for (int i = left;i < right;i++) {
                if (nums[i] % 2 == 0) {
                    left = i;
                    leftflag = true;
                    break;
                }
            }
            for (int j = right;j > left;j--) {
                if (nums[j] % 2 == 1) {
                    right = j;
                    rightflag = true;
                    break;
                }
            }
            if (leftflag && rightflag) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
            else {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4,6};
        printArray(nums1);
        printArray(exchange(nums1));
        int[] nums2 = {2,4,6,1};
        printArray(nums2);
        printArray(exchange(nums2));
        int[] nums3 = {2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
        printArray(nums3);
        printArray(exchange(nums3));
    }
}
