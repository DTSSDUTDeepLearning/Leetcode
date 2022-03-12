package SuanFa.l1492;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1492 {

    public int kthFactor(int n, int k) {
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(n);
        int time = 0;
        for (int i = 2;i < Math.sqrt(n);i++) {
            if (n % i == 0) {
                l.add(time, i);
                l.add(l.size()-time,n/i);
                time++;
            }
        }
        int a = (int)Math.sqrt(n);
        if (n == a*a) {
            l.add(time, a);
        }
        if (l.size() < k) {
            return -1;
        }
        else {
            return l.get(k);
        }
    }
}
