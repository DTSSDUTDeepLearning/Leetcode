package SuanFa.l1186;

public class l1186 {

    public int maximumSum(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return arr[0];
        }
        int a = arr[0] > 0?arr[0]+arr[1]:arr[1];
        int b = Math.max(arr[0], arr[1]);
        int max = Math.max(a, b);
        for (int i = 2;i < len;i++) {
            b = Math.max(a, b+arr[i]);
            a = a>0?a+arr[i]:arr[i];
            max = Math.max(max, Math.max(a, b));
        }
        return max;
    }
}
