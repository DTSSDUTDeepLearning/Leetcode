package SuanFa.l1877;

public class l1877 {

    public int minPairSum(int[] nums) {
        int[] n = new int[100001];
        for (int num : nums) {
            n[num]++;
        }
        int i = 1;
        int j = 100000;
        int max = 0;
        while (i <= j) {
            while (i <= j && n[i] == 0) {
                i++;
            }
            while (i <= j && n[j] == 0) {
                j--;
            }
            if (i <= j) {
                max = Math.max(max, i+j);
                n[i]--;
                n[j]--;
            }
        }
        return max;
    }
}
