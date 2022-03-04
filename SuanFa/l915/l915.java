package SuanFa.l915;

public class l915 {

    public int partitionDisjoint(int[] A) {
        int len = A.length;
        int[] max = new int[len];
        int[] min = new int[len];

        max[0] = A[0];
        for (int i = 1;i < len;i++) {
            max[i] = Math.max(max[i-1], A[i]);
        }

        min[len-1] = A[len-1];
        for (int i = len-2;i >= 0;i--) {
            min[i] = Math.min(min[i+1], A[i]);
        }

        for (int i = 1;i < len;i++) {
            if (max[i-1] <= min[i]) {
                return i;
            }
        }
        return -1;
    }
}
