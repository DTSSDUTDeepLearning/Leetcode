package SuanFa.l1524;

public class l1524 {

    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int len = arr.length;
        int sum = 0;
        int cnt = 0;
        int odd = 0;
        int even = 1;
        for (int num : arr) {
            sum+=num;
            if (sum % 2 == 0) {
                cnt = (cnt + odd) % MOD;
                even++;
            }
            else {
                cnt = (cnt + even) % MOD;
                odd++;
            }
        }
        return cnt;
    }
}
