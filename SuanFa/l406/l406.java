package SuanFa.l406;

import java.util.Arrays;
import java.util.Comparator;

public class l406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        int len = people.length;
        for (int i = 1;i < len;i++) {
            int[] p = people[i];
            if (people[p[1]][0] > p[0]) {
                for (int j = i;j > p[1];j--) {
                    people[j] = people[j-1];
                }
                people[p[1]] = p;
            }
        }
        return people;
    }
}
