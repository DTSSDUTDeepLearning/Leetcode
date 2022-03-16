package SuanFa.l1854;

public class l1854 {

    public int maximumPopulation(int[][] logs) {
        int[] cnt = new int[101];
        for (int[] log : logs) {
            cnt[log[0] - 1950]++;
            cnt[log[1] - 1950]--;
        }
        int people_sum = 0;
        int max_people = -1;
        int max_year = 1949;
        for (int i = 0;i < 101;i++) {
            people_sum+=cnt[i];
            if (max_people < people_sum) {
                max_people = people_sum;
                max_year = i + 1950;
            }
        }
        return max_year;
    }
}