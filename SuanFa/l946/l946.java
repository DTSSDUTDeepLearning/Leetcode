package SuanFa.l946;

import java.util.Deque;
import java.util.LinkedList;

public class l946 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> s = new LinkedList<>();
        int len = popped.length;
        int i = 0;
        for (int num : pushed) {
            s.push(num);
            while (!s.isEmpty() && i < len && s.peek()==popped[i]) {
                s.pop();
                i++;
            }
        }
        return i==len;
    }
}
