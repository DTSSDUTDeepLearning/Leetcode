package l3285;

import java.util.ArrayList;
import java.util.List;

public class l3285 {

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1;i < height.length;i++) {
            if (height[i-1] > threshold) {
                res.add(i);
            }
        }
        return res;
    }
}
