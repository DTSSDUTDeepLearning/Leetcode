package SuanFa.l977;

public class l977 {

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int left = 0;
        int right = len-1;
        // 两端开始，逐渐相遇，代码写起来最省事
        while (left < right) {
            if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                result[len-1] = nums[right]*nums[right];
                right--;
            }
            else {
                result[len-1] = nums[left]*nums[left];
                left++;
            }
            len--;
        }
        return result;
    }
}
