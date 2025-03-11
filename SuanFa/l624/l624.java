package l624;

import java.util.List;

public class l624 {

    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> array = arrays.get(0);
        int max = array.get(array.size()-1);
        int min = array.get(0);
        int result = 0;
        for (int i = 1;i < arrays.size();i++) {
            array = arrays.get(i);
            int arrayMax = array.get(array.size()-1);
            int arrayMin = array.get(0);
            result = Math.max(result, Math.max(Math.abs(arrayMax-min),
                    Math.abs(max-arrayMin)));
            max = Math.max(max, arrayMax);
            min = Math.min(min, arrayMin);
        }
        return result;
    }
}