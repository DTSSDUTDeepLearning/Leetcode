package JianZhiOffer.l031;

import java.util.Deque;
import java.util.LinkedList;

public class l031 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        Deque<Integer> s = new LinkedList<>();
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
