package SuanFa.l1619;

import java.util.Arrays;

public class l1619 {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int delete = (int)(len*0.05);
        int sum = 0;
        for (int i = delete;i < len-delete;i++) {
            sum+=arr[i];
        }
        return (double)sum / (len-2*delete);
    }
}
