package JianZhiOffer.l006;

public class l006 {

    public int[] reversePrint(ListNode head) {
        int[] r = new int[10001];
        int j = 0;
        while (head != null) {
            r[j] = head.val;
            head = head.next;
            j++;
        }
        System.out.println(j);
        int[] s = new int[j];
        for (int i = 0;i < j;i++) {
            s[i] = r[j-i-1];
        }
        return s;
    }
}
