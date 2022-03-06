package SuanFa.l1019;

import SuanFa.ListNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l1019 {

    public int[] nextLargerNodes(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        List<Integer> l = new LinkedList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        int len = l.size();
        int[] val = new int[len];
        for (int i = 0;i < len;i++) {
            val[i] = l.get(i);
        }
        int[] result = new int[len];
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            while (!s.isEmpty() && val[s.peek()] < val[i]) {
                result[s.pop()] = val[i];
            }
            s.push(i);
        }
        return result;
    }
}
