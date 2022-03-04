package SuanFa.l922;

public class l922 {

    public int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < nums.length-1) {
            while (left < nums.length-1 && nums[left]%2==0) {
                left+=2;
            }
            while (right > 0 && nums[right]%2==1) {
                right-=2;
            }
            if (left < nums.length-1) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
            left+=2;
            right-=2;
        }
        return nums;
    }
}
