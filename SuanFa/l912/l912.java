package SuanFa.l912;

public class l912 {

    public int[] sortArray(int[] nums) {
        partition(nums, 0, nums.length-1);
        return nums;
    }

    public void partition(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = quicksort(nums, left, right);
        partition(nums, left, p-1);
        partition(nums, p+1, right);
    }

    public int quicksort(int[] nums, int left, int right) {
        int pivot = nums[left];
        int p = left;
        left++;
        while (left <= right) {
            while (left <= right && nums[left] <= pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        nums[p] = nums[right];
        nums[right] = pivot;
        return right;
    }
}
