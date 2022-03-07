package MianShiTi.t02.l001;

import MianShiTi.t02.ListNode;

import java.util.HashSet;
import java.util.Set;

public class l001 {

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Set<Integer> s = new HashSet<>();
        ListNode cur = head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        while (cur != null) {
            if (s.contains(cur.val)) {
                pre.next = cur.next;
            }
            else {
                s.add(cur.val);
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
