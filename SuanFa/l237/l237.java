package SuanFa.l237;

import SuanFa.ListNode;

public class l237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
