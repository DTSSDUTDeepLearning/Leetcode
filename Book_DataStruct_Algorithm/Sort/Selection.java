package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,7};
        // 选择排序
        selection(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void selection(int[] arrays) {
        int n = arrays.length;
        for (int i = 0;i < n-1;i++) {
            int min = i;
            for (int j = i+1;j < n;j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int tmp = arrays[i];
            arrays[i] = arrays[min];
            arrays[min] = tmp;
        }
    }
}
