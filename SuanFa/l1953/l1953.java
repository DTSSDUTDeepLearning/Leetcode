package SuanFa.l1953;

public class l1953 {

    public long numberOfWeeks(int[] milestones) {
        long longest = 0;
        long rest = 0;
        for (int m : milestones) {
            longest = Math.max(longest, m);
            rest+=m;
        }
        rest-=longest;
        if (longest > rest + 1) {
            return rest * 2 + 1;
        }
        else {
            return longest + rest;
        }
    }
}
