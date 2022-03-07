package SuanFa.l1089;

public class l089 {

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int i = 0;
        int cnt = 0;
        while (i + cnt < len) {
            if (arr[i] == 0) {
                cnt++;
            }
            i++;
        }
        int k = len-1;
        if (i + cnt == len+1) {
            arr[k--] = 0;
        }
        for (int j = i-1;j >= 0;j--) {
            if (arr[j] == 0) {
                arr[k--] = 0;
                arr[k--] = 0;
            }
            else {
                arr[k--] = arr[j];
            }
        }
    }
}
