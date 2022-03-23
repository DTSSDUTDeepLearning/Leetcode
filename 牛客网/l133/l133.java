package NowCoder.l133;

public class l133 {

    public ListNode oddEvenList (ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_curr = even;
        head = head.next.next;
        while (head != null && head.next != null) {
            odd.next = head;
            even_curr.next = head.next;
            odd = odd.next;
            even_curr = even_curr.next;
        }
        if (head != null) {
            odd.next = head;
            odd = odd.next;
        }
        odd.next = even;
        even_curr.next = null;
        return pre.next;
    }
}
