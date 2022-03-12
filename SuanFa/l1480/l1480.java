package SuanFa.l1480;

public class l1480 {
    public static void printarray(int[] result) {
        for (int i = 0;i < result.length;i++) {
            System.out.print(result[i]);
            System.out.print("   ");
        }
        System.out.println();
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1;i < nums.length;i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        printarray(result);
    }
}
