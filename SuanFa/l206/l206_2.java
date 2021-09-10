package SuanFa.l206;

import SuanFa.ListNode;

public class l206_2 {

    //使用迭代的方法来实现
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        ListNode reversehead = curr;
        ListNode reversecurr = reversehead;
        prev.next = null;

        while (head.next != null) {
            prev = head;
            curr = head.next;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            reversecurr.next = curr;
            reversecurr = reversecurr.next;
            prev.next = null;
        }
        reversecurr.next = head;
        return reversehead;
    }
}
