package SuanFa.l206;

import SuanFa.ListNode;

public class l206_1 {

    //使用递归的方法来实现
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int first = head.val;
        ListNode reversehead = reverseList(head.next);
        ListNode curr = reversehead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(first);
        return reversehead;
    }
}
