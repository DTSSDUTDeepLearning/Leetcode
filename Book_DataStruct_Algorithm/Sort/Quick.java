package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,5};
        // 快速排序
        quick(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void quick(int[] arrays) {
        partition(arrays, 0, arrays.length-1);
    }

    public static void partition(int[] arrays, int left, int right) {
        if (left < right) {
            // 教科书中提到了两种快排方法，第二种更常用一些
//            int p = quick_sort1(arrays, left, right);
            int p = quick_sort2(arrays, left, right);
            partition(arrays, left, p-1);
            partition(arrays, p+1, right);
        }
    }

    public static int quick_sort1(int[] arrays, int left, int right) {
        int p = left;
        int pivot = arrays[left];
        while (left < right) {
            while (left < right && arrays[right] > pivot) {
                right--;
            }
            if (left < right) {
                arrays[left] = arrays[right];
            }
            while (left < right && arrays[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arrays[right] = arrays[left];
            }
        }
        arrays[right] = pivot;
        return right;
    }

    public static int quick_sort2(int[] arrays, int left, int right) {
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
