package MianShiTi.t02.l006;

import MianShiTi.t02.ListNode;
import java.util.LinkedList;
import java.util.List;

public class l006 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> l = new LinkedList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = l.size()-1;
        while (left < right) {
            if (l.get(left) != l.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
