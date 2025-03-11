package l2347;

import java.util.Deque;
import java.util.LinkedList;

public class l2347 {

    public String bestHand(int[] ranks, char[] suits) {
        if (suits[0] == suits[1] && suits[0] == suits[2]
                && suits[0] == suits[3] && suits[0] == suits[4]) {
            return "Flush";
        }
        int[] cnt = new int[14];
        for (int n : ranks) {
            cnt[n]++;
        }
        int max = 0;
        for (int i = 1;i <= 13;i++) {
            max = Math.max(max, cnt[i]);
        }
        if (max >= 3) {
            return "Three of a Kind";
        }
        else if (max == 2) {
            return "Pair";
        }
        else {
            return "High Card";
        }
    }

    public static void main(String[] args) {
        Deque<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
    }
}
