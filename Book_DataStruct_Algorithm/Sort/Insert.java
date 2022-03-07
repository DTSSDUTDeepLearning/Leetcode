package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,7};
        // 直接插入排序
//        insert_direct(arrays);
//        System.out.println(Arrays.toString(arrays));

        // 折半插入排序
//        insert_halve(arrays);
//        System.out.println(Arrays.toString(arrays));
    }

    public static void insert_direct(int[] arrays) {
        int n = arrays.length;
        for (int i = 1;i < n;i++) {
            int j = i-1;
            int k = arrays[i];
            while (j >= 0 && arrays[j] > k) {
                arrays[j+1] = arrays[j];
                j--;
            }
            arrays[j+1] = k;
        }
    }

    public static void insert_halve(int[] arrays) {
        int n = arrays.length;
        for (int i = 1;i < n;i++) {
            int index = find_insert_index(arrays, i, arrays[i]);
            int k = arrays[i];
            for (int j = i;j > index;j--) {
                arrays[j] = arrays[j-1];
            }
            arrays[index] = k;
        }
    }

    public static int find_insert_index(int[] arrays, int right, int k) {
        int left = 0;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (arrays[mid] < k) {
                left = mid+1;
            }
            else {
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        return left;
    }
}
