package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,7};
        // 归并排序
        merge(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void merge(int[] arrays) {
        partition(arrays, 0, arrays.length-1);
    }

    public static void partition(int[] arrays, int left, int right) {
        if (left < right) {
            int mid = left + (right-left)/2;
            partition(arrays, left, mid);
            partition(arrays, mid+1, right);
            synthesize(arrays, left, mid, right);
        }
    }

    public static void synthesize(int[] arrays, int left, int mid, int right) {
        int[] tmp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= right) {
            tmp[k++] = arrays[i] <= arrays[j]?arrays[i++]:arrays[j++];
        }
        if (i > mid) {
            for (;j <= right;j++) {
                tmp[k++] = arrays[j];
            }
        }
        else {
            for (;i <= mid;i++) {
                tmp[k++] = arrays[i];
            }
        }
        for (i = left;i <= right;i++) {
            arrays[i] = tmp[i-left];
        }
    }
}
