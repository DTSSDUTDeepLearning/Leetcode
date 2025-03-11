package l2080;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l2080 {
}

class RangeFreqQuery {

    Map<Integer, List<Integer>> map;

    public RangeFreqQuery(int[] arr) {
        map = new HashMap<>();
        for (int i = 0;i < arr.length;i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
    }

    public int query(int left, int right, int value) {
        List<Integer> indices = map.getOrDefault(value, new ArrayList<>());
        int leftBound = leftbinaryBound(indices, left);
        int rightBound = rightbinaryBound(indices, right);
        return rightBound - leftBound + 1;
    }

    private int leftbinaryBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == target) {
                return mid;
            }
            else if (list.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    private int rightbinaryBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == target) {
                return mid;
            }
            else if (list.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return right;
    }
}