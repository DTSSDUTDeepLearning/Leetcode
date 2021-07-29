package JianZhiOffer.l024;

public class l024_1 {
    //使用递归，时间与空间开销都比较大

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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode x = reverseList(head.next);
        ListNode curr = x;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        head.next = null;
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = changetoarray(arr);
        printListNode(head);
        ListNode result = reverseList(head);
        printListNode(result);
    }
}
