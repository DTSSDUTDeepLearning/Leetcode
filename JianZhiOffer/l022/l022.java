package JianZhiOffer.l022;

public class l022 {

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

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 0;i < len-k;i++) {
            curr = curr.next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = changetoarray(arr);
        printListNode(head);
        int k = 2;
        ListNode reuslt = getKthFromEnd(head, k);
        printListNode(reuslt);
    }
}
