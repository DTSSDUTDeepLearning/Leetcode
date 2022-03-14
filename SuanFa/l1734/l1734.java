package SuanFa.l1734;

public class l1734 {

    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int a = 1;
        for (int i = 2;i <= n;i++) {
            a ^= i;
        }
        int b = 1;
        for (int i = 1;i < n-1;i+=2) {
            b ^= encoded[i];
        }
        return decode1720(encoded, a ^ b);
    }

    public int[] decode1720(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len+1];
        arr[0] = first;
        for (int i = 1;i <= len;i++) {
            arr[i] = encoded[i-1] ^ arr[i-1];
        }
        return arr;
    }
}
