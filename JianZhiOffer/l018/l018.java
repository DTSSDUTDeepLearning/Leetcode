package JianZhiOffer.l018;

public class l018 {

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

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode curr = head;
        boolean flag = true;
        if (head.val == val) {
            return head.next;
        }
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                flag = false;
                break;
            }
            curr = curr.next;
        }
        if (flag) {
            ListNode c = head;
            while (c.next.next != null) {
                c = c.next;
            }
            c.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,9};
        ListNode head = changetoarray(arr);
        int val = 5;
        printListNode(head);
        ListNode result = deleteNode(head, val);
        printListNode(result);
    }
}
