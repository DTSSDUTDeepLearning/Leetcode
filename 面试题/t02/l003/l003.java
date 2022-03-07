package MianShiTi.t02.l003;

import MianShiTi.t02.ListNode;

public class l003 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
