package SuanFa.l1534;

public class l1534 {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length;
        int cnt = 0;
        for (int i = 0;i < len-2;i++) {
            for (int j = i+1;j < len-1;j++) {
                if (Math.abs(arr[i]-arr[j]) <= a) {
                    for (int k = j+1;k < len;k++) {
                        if (Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
