package l911;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopVotedCandidate {

    List<Integer> tops;
    Map<Integer, Integer> votes;
    int[] times;

    public TopVotedCandidate(int[] persons, int[] times) {
        tops = new ArrayList<>();
        votes = new HashMap<>();
        this.times = times;
        votes.put(-1, -1);
        int top = -1;
        for (int person : persons) {
            votes.put(person, votes.getOrDefault(person, 0) + 1);
            if (votes.get(person) >= votes.get(top)) {
                top = person;
            }
            tops.add(top);
        }
    }

    public int q(int t) {
        int left = 0;
        int right = times.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (times[mid] <= t) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return tops.get(right);
    }
}
