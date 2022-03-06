package SuanFa.l1006;

import java.util.Deque;
import java.util.LinkedList;

public class l1006_1 {

    // 使用栈模拟
    public int clumsy(int N) {
        Deque<Integer> s = new LinkedList<>();
        s.push(N);
        for (int i = 0;i < N-1;i++) {
            if (i % 4 == 0) {
                s.push(s.pop()*(N-1-i));
            }
            else if (i % 4 == 1) {
                s.push(s.pop()/(N-1-i));
            }
            else if (i % 4 == 2) {
                s.push(N-1-i);
            }
            else {
                s.push(-N+1+i);
            }
        }
        int sum = 0;
        for (int n : s) {
            sum+=n;
        }
        return sum;
    }
}
