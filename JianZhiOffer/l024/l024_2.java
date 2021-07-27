package JianZhiOffer.l024;

public class l024_2 {
    //顺序执行，时间开销极小，空间开销较小

    public static ListNode changetoarray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1;i<arr.length;i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            System.out.print("   ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode nex = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = changetoarray(arr);
        printListNode(head);
        ListNode result = reverseList(head);
        printListNode(result);
    }
}
