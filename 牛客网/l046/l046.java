package NowCoder.l046;

import java.util.ArrayList;
import java.util.Arrays;

public class l046 {

    ArrayList<ArrayList<Integer>> results;
    ArrayList<Integer> l;
    int[] num;
    int len;

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        len = num.length;
        results = new ArrayList<>();
        l = new ArrayList<>();
        if (len == 0) {
            return results;
        }
        Arrays.sort(num);
        this.num = num;
        dfs(0, target);
        return results;
    }

    public void dfs(int begin, int target) {
        if (target == 0) {
            results.add(new ArrayList<>(l));
            return;
        }
        for (int i = begin;i < len;i++) {
            if (target - num[i] >= 0) {
                if (!(i > begin && num[i] == num[i-1])) {
                    l.add(num[i]);
                    dfs(i+1, target - num[i]);
                    l.remove(l.size() - 1);
                }
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        l046 l = new l046();
        int[] num = {100,10,20,70,60,10,50};
        int target = 80;
        l.combinationSum2(num, target);
    }
}
