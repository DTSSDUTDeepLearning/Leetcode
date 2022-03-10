package SuanFa.l1310;

public class l1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length;
        int[] xor = new int[len];
        xor[0] = arr[0];
        for (int i = 1;i < len;i++) {
            xor[i] = xor[i-1] ^ arr[i];
        }
        len = queries.length;
        int[] results = new int[len];
        for (int i = 0;i < len;i++) {
            if (queries[i][0] == 0) {
                results[i] = xor[queries[i][1]];
            }
            else {
                results[i] = xor[queries[i][0]-1] ^ xor[queries[i][1]];
            }
        }
        return results;
    }
}
