package NowCoder.l140;

import java.util.Arrays;

public class l140 {

    public int[] MySort (int[] arr) {
        partition(arr, 0, arr.length-1);
        return arr;
    }

    public void partition(int[] arrays, int left, int right) {
        if (left < right) {
            int p = quick_sort(arrays, left, right);
            partition(arrays, left, p-1);
            partition(arrays, p+1, right);
        }
    }

    public static int quick_sort(int[] arrays, int left, int right) {
        int p = left;
        int pivot = arrays[left++];
        while (left <= right) {
            while (left <= right && arrays[left] <= pivot) {
                left++;
            }
            while (left <= right && arrays[right] > pivot) {
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
