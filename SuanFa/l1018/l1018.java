package SuanFa.l1018;

import java.util.ArrayList;
import java.util.List;

public class l1018 {

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int prefix = 0;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            prefix = ((prefix << 1) + A[i]) % 5;
            list.add(prefix == 0);
        }
        return list;
    }

}
