package SuanFa.l881;

import java.util.Arrays;

public class l881 {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int heavy = people.length-1;
        int thin = 0;
        while (thin < heavy) {
            if (people[heavy]+people[thin] <= limit) {
                heavy--;
                thin++;
            }
            else {
                heavy--;
            }
            cnt++;
        }
        return cnt;
    }
}
