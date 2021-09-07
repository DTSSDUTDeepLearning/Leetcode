package SuanFa.l066;

public class l066 {

    public static void printarray(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while (index >= 0 && digits[index] == 9) {
            digits[index--] = 0;
        }
        if (index != -1) {
            digits[index]++;
            return digits;
        }
        else {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 1;i < result.length;i++) {
                result[i] = 0;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {0};
        int[] digits4 = {9,9,9};
        int[] digits5 = {9};
        printarray(plusOne(digits1));
        printarray(plusOne(digits2));
        printarray(plusOne(digits3));
        printarray(plusOne(digits4));
        printarray(plusOne(digits5));
    }
}
