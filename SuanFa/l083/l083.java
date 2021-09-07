package SuanFa.l083;

import SuanFa.ListNode;

public class l083 {

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

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {1,1,2,3,3};
        int[] arr3 = {1,1,1};
        printListNode(deleteDuplicates(changetoarray(arr1)));
        printListNode(deleteDuplicates(changetoarray(arr2)));
        printListNode(deleteDuplicates(changetoarray(arr3)));
    }
}
