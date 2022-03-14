package SuanFa.l1669;

public class l1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        for (int i = 0;i < a-1;i++) {
            curr1 = curr1.next;
        }
        ListNode curr2 = curr1;
        for (int i = a-1;i <= b;i++) {
            curr2 = curr2.next;
        }
        curr1.next = list2;
        ListNode curr3 = list2;
        while (curr3.next != null) {
            curr3 = curr3.next;
        }
        curr3.next = curr2;
        return list1;
    }
}
