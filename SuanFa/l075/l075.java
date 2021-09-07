package SuanFa.l075;

public class l075 {

    public static void printArray(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static void sortColors(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }
        int white = len+1;
        int blue = white;
        for (int i = 0;i < len;i++) {
            if (nums[i] == 2) {
                if (blue > i) {
                    blue = i;
                }
            }
            else if (nums[i] == 1) {
                if (blue > i) {
                    if (white > i) {
                        white = i;
                    }
                }
                else if (white > i) {
                    white = blue;
                    nums[blue++] = 1;
                    nums[i] = 2;
                }
                else {
                    nums[blue++] = 1;
                    nums[i] = 2;
                }
            }
            else{
                if (blue < i) {
                    if (white < i) {
                        nums[white++] = 0;
                        nums[blue++] = 1;
                    }
                    else {
                        nums[blue++] = 0;
                    }
                    nums[i] = 2;
                }
                else {
                    if (white < i) {
                        nums[white++] = 0;
                        nums[i] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0};
        int[] nums2 = {2,0,1};
        int[] nums3 = {0};
        int[] nums4 = {1};
        int[] nums5 = {1,1,0};
        sortColors(nums1);
        sortColors(nums2);
        sortColors(nums3);
        sortColors(nums4);
        sortColors(nums5);
        printArray(nums1);
        printArray(nums2);
        printArray(nums3);
        printArray(nums4);
        printArray(nums5);
    }
}
