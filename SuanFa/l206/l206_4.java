package SuanFa.l206;

import SuanFa.ListNode;

public class l206_4 {

    //官方题解，使用迭代的方法来实现
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
