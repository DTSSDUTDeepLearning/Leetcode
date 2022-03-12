package SuanFa.l1471;

import java.util.Arrays;

public class l1471 {

    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int len = arr.length;
        int m = arr[(len-1)/2];
        int i = 0;
        int j = len-1;
        int[] result = new int[k];
        for (int time = 0;time < k;time++) {
            if (m-arr[i] > arr[j]-m) {
                result[time] = arr[i];
                i++;
            }
            else {
                result[time] = arr[j];
                j--;
            }
        }
        return result;
    }
}
