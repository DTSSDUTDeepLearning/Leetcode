package SuanFa.l215;

import java.util.PriorityQueue;

public class l215_2 {

    // 快速排序的思想
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int pivot = quick_sort(nums, left, right);
        while (pivot != k) {
            if (pivot < k) {
                left = pivot+1;
            }
            else {
                right = pivot-1;
            }
            pivot = quick_sort(nums, left, right);
        }
        return nums[k];
    }

    public int quick_sort(int[] arrays, int left, int right) {
        int p = left;
        int pivot = arrays[left++];
        while (left <= right) {
            while (left <= right && arrays[left] >= pivot) {
                left++;
            }
            while (left <= right && arrays[right] < pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = tmp;
            }
        }
        arrays[p] = arrays[right];
        arrays[right] = pivot;
        return right;
    }
}
