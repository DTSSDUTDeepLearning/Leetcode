package NowCoder.l037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class l037 {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> results = new ArrayList<>();
        if (intervals.size() == 0) {
            return results;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start) {
                    return o2.end - o1.end;
                }
                else {
                    return o1.start - o2.start;
                }
            }
        });

        ArrayList<Interval> merged = new ArrayList<>();
        Interval itv = intervals.get(0);
        int left = itv.start;
        int right = itv.end;
        merged.add(itv);
        int len = intervals.size();
        for (int i = 1; i < len; i++) {
            if (left != intervals.get(i).start) {
                left = intervals.get(i).start;
                right = intervals.get(i).end;
                if (merged.get(merged.size() - 1).end < left) {
                    merged.add(intervals.get(i));
                } else {
                    merged.get(merged.size() - 1).end = Math.max(merged.get(merged.size() - 1).end, right);
                }
            }
        }
        return merged;
    }
}
