package NowCoder.l040;

import java.util.ArrayDeque;
import java.util.Deque;

public class l040 {

    public ListNode addInList (ListNode head1, ListNode head2) {
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        Deque<Integer> s3 = new ArrayDeque<>();
        while (head1 != null) {
            s1.push(head1.val);
            head1 = head1.next;
        }
        while (head2 != null) {
            s2.push(head2.val);
            head2 = head2.next;
        }
        boolean flag = false;
        int tmp = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int i1 = s1.pop();
            int i2 = s2.pop();
            tmp += (i1+i2);
            s3.push(tmp%10);
            flag = tmp>=10;
            tmp = flag?1:0;
        }
        while (!s1.isEmpty()) {
            tmp += s2.pop();
            s3.push(tmp%10);
            flag = tmp>=10;
            tmp = flag?1:0;
        }
        while (!s2.isEmpty()) {
            tmp += s1.pop();
            s3.push(tmp%10);
            flag = tmp>=10;
            tmp = flag?1:0;
        }
        if (flag) {
            s3.push(1);
        }
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while (!s3.isEmpty()) {
            curr.next = new ListNode(s3.pop());
            curr = curr.next;
        }
        return result.next;
    }
}
