package MianShiTi.t10.l010;

import java.util.LinkedList;
import java.util.List;

public class StreamRank {

    List<Integer> l;

    public StreamRank() {
        l = new LinkedList<>();
    }

    public void track(int x) {
        int left = 0;
        int right = l.size()-1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            int num = l.get(mid);
            if (num == x) {
                l.add(mid, x);
                return;
            }
            else if (num < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        l.add(left, x);
    }

    public int getRankOfNumber(int x) {
        if (l.isEmpty()) {
            return 0;
        }
        if (l.get(l.size()-1) == x) {
            return l.size();
        }
        int left = 0;
        int right = l.size()-2;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            int num = l.get(mid);
            if (num == x && l.get(mid+1) != x) {
                return mid+1;
            }
            if (num <= x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
