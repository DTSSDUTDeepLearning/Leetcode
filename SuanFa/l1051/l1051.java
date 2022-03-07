package SuanFa.l1051;

public class l1051 {

    int[] bucket;

    public int heightChecker(int[] heights) {
        bucket = new int[100];
        for (int height : heights) {
            bucket[height-1]++;
        }
        int i = 0;
        int cnt = 0;
        for (int height : heights) {
            i = search_min_bucket(i);
            if (i != height-1) {
                cnt++;
            }
        }
        return cnt;
    }

    public int search_min_bucket(int start) {
        while (start < 100 && bucket[start] == 0) {
            start++;
        }
        bucket[start]--;
        return start;
    }
}
