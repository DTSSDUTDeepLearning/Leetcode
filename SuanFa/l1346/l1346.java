package SuanFa.l1346;

import java.util.HashSet;
import java.util.Set;

public class l1346 {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            if (s.contains(num*2) || num % 2 == 0 && s.contains(num / 2)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
}
