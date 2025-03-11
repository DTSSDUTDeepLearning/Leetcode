package l2274;

import java.util.Arrays;

public class l2274 {

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int result = 0;
        result = Math.max(result, special[0] - bottom);
        for (int i = 1; i < special.length; ++i) {
            result = Math.max(result, special[i] - special[i - 1] - 1);
        }
        result = Math.max(result, top - special[special.length - 1]);
        return result;
    }
}
