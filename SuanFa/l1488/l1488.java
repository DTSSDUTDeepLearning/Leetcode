package SuanFa.l1488;

import java.util.*;

public class l1488 {

    public int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> last_rain = new HashMap<>();
        List<Integer> sunny = new ArrayList<>();
        int len = rains.length;
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            if (rains[i] > 0) {
                if (last_rain.containsKey(rains[i])) {
                    int last_rain_day = last_rain.get(rains[i]);
                    int index = find(sunny.toArray(new Integer[sunny.size()]), last_rain_day);
                    if (index == -1) {
                        return new int[]{};
                    }
                    result[sunny.get(index)] = rains[i];
                    sunny.remove(index);
                }
                result[i] = -1;
                last_rain.put(rains[i], i);
            }
            else {
                sunny.add(i);
                result[i] = 1;
            }
        }
        return result;
    }

    public int find(Integer[] sunny, int day) {
        int right = sunny.length - 1;
        if (right == -1) {
            return -1;
        }
        if (sunny[0] > day) {
            return 0;
        }
        if (sunny[right] < day) {
            return -1;
        }
        int left = 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (sunny[mid-1] < day && sunny[mid] > day) {
                return mid;
            }
            if (sunny[mid] > day) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
