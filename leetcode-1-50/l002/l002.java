package SuanFa.l002;

public class l002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2, true);
    }
    public static ListNode add(ListNode l1, ListNode l2,boolean flag) {
        boolean a= l1==null;
        boolean b= l2==null;
        if (a&&b&&flag) {
            return null;
        }
        int val=(a?0:l1.val)+(b?0:l2.val)+(flag?0:1);
        int v=val%10;
        boolean f= v==val;
        ListNode answer=new ListNode(v);
        answer.next=add(a?null:l1.next,b?null:l2.next,f);
        return answer;
    }
}
