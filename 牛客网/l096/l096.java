package NowCoder.l096;

import java.util.ArrayDeque;
import java.util.Deque;

public class l096 {

    public boolean isPail (ListNode head) {
        Deque<Integer> s = new ArrayDeque<>();
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        while (s.size()>=2) {
            if (!s.pollFirst().equals(s.pollLast())) {
                return false;
            }
        }
        return true;
    }
}
