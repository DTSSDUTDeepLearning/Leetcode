package SuanFa.l1155;

public class l1155 {

    public int numRollsToTarget(int d, int f, int target) {
        int MOD = 1000000007;
        if (d > target || d*f < target) {
            return 0;
        }
        int[] results = new int[target];
        if (target < f) {
            for (int i = 0;i < target;i++) {
                results[i] = 1;
            }
            for (int i = 1;i < d;i++) {
                int[] tmp = new int[target];
                for (int j = i;j < target;j++) {
                    for (int k = 0;k < j;k++) {
                        tmp[j] = (tmp[j] + results[k]) % MOD;
                    }
                }
                results = tmp;
            }
        }
        else {
            for (int i = 0;i < f;i++) {
                results[i] = 1;
            }
            for (int i = f;i < target;i++) {
                results[i] = 0;
            }
            for (int i = 1;i < d;i++) {
                int[] tmp = new int[target];
                for (int j = i;j < target;j++) {
                    for (int k = Math.max(0, j-f);k < j;k++) {
                        tmp[j] = (tmp[j] + results[k]) % MOD;
                    }
                }
                results = tmp;
            }
        }
        return results[target-1];
    }
}
