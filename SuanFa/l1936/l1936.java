package SuanFa.l1936;

public class l1936 {

    public int addRungs(int[] rungs, int dist) {
        int sum = (rungs[0] - 1) / dist;
        int len = rungs.length;
        for (int i = 1;i < len;i++) {
            sum += (rungs[i] - rungs[i-1] - 1) / dist;
        }
        return sum;
    }
}
