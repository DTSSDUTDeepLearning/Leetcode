package SuanFa.l027;

public class l027 {

    public static void printYuanDiarray(int[] nums, int len) {
        for (int i = 0;i < len;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int cnt = 0;
        int left = 0;
        int right = nums.length-1;
        while (right >= left) {
            if (nums[left] == val) {
                if (nums[right] == val) {
                    right--;
                }
                else {
                    nums[left++] = nums[right--];
                }
                cnt++;
            }
            else {
                left++;
            }
        }
        return nums.length-cnt;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int[] nums3 = {};
        int val3 = 2;
        int[] nums4 = {2};
        int val4 = 3;
        int[] nums5 = {2,3};
        int val5 = 4;
        int[] nums6 = {1};
        int val6 = 1;
        int[] nums7 = {1,1,1,1,1};
        int val7 = 1;
        int remove1 = removeElement(nums1, val1);
        printYuanDiarray(nums1, remove1);
        int remove2 = removeElement(nums2, val2);
        printYuanDiarray(nums2, remove2);
        int remove3 = removeElement(nums3, val3);
        printYuanDiarray(nums3, remove3);
        int remove4 = removeElement(nums4, val4);
        printYuanDiarray(nums4, remove4);
        int remove5 = removeElement(nums5, val5);
        printYuanDiarray(nums5, remove5);
        int remove6 = removeElement(nums6, val6);
        printYuanDiarray(nums6, remove6);
        int remove7 = removeElement(nums7, val7);
        printYuanDiarray(nums7, remove7);
    }
}
