package SuanFa.l283;

public class l283 {

    public static int findnextnon(int[] nums, int len, int non) {
        while (non < len) {
            if (nums[non] != 0) {
                break;
            }
            non++;
        }
        return non;
    }

    public static int findnextzero(int[] nums, int len, int zero) {
        while (zero < len) {
            if (nums[zero] == 0) {
                break;
            }
            zero++;
        }
        return zero;
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return;
        }
        int zero = findnextzero(nums, len, 0);
        int non = findnextnon(nums, len, zero);
        while (non < len) {
            int tmp = nums[non];
            nums[non] = nums[zero];
            nums[zero] = tmp;
            zero = findnextzero(nums, len, zero);
            non = findnextnon(nums, len, zero);
        }
    }
}
