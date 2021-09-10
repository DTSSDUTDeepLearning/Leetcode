package SuanFa.l206;

import SuanFa.ListNode;

public class l206_3 {

    //官方题解，使用递归的方法来实现
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tmp;
    }
}
