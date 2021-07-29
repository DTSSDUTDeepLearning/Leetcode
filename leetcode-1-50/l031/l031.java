package SuanFa.l031;

public class l031 {

    public static void printarray(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }


    public static void nextPermutation(int[] nums) {
        int pos=-1;
        for (int i = nums.length-2;i >= 0;i--) {
            if (nums[i] < nums[i+1]) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            for (int i = 0;i < nums.length/2;i++) {
                int tmp = nums[i];
                nums[i] = nums[nums.length-i-1];
                nums[nums.length-i-1] = tmp;
            }
        }
        else {
            int pos2 = -1;
            for (int i = nums.length-1;i > pos;i--) {
                if (nums[i] > nums[pos]) {
                    pos2 = i;
                    break;
                }
            }
            int tmp = nums[pos];
            nums[pos] = nums[pos2];
            nums[pos2] = tmp;
            for (int i = 1;i <= (nums.length-pos)/2;i++) {
                tmp = nums[pos+i];
                nums[pos+i] = nums[nums.length-i];
                nums[nums.length-i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,1,5};
        int[] nums4 = {1};
        int[] nums5 = {};
        int[] nums6 = {1,3,2};
        nextPermutation(nums1);
        nextPermutation(nums2);
        nextPermutation(nums3);
        nextPermutation(nums4);
        nextPermutation(nums5);
        nextPermutation(nums6);
        printarray(nums1);
        printarray(nums2);
        printarray(nums3);
        printarray(nums4);
        printarray(nums5);
        printarray(nums6);

        int[] nums7 = {5,6,7,3,7,6,5,4,3,2};
        for (int i = 0;i < 5;i++) {
            nextPermutation(nums7);
            printarray(nums7);
        }

        int[] nums8 = {1,1,2,5};
        for (int i = 0;i < 16;i++) {
            nextPermutation(nums8);
            printarray(nums8);
        }
    }
}
