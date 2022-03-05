package SuanFa.l989;

import java.util.LinkedList;
import java.util.List;

public class l989 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> l = new LinkedList<>();
        int right = A.length-1;
        int flag = 0;
        while (right >= 0 && K > 0) {
            int num = A[right]+K%10+flag;
            if (num >= 10) {
                flag = 1;
                num-=10;
            }
            else {
                flag = 0;
            }
            l.add(0, num);
            right--;
            K/=10;
        }
        if (right >= 0) {
            for (int i = right;i >= 0;i--) {
                int num = A[i]+flag;
                if (num >= 10) {
                    flag = 1;
                    num-=10;
                }
                else {
                    flag = 0;
                }
                l.add(0, num);
            }
        }
        else if (K > 0) {
            while (K > 0) {
                int num = K%10+flag;
                if (num >= 10) {
                    flag = 1;
                    num-=10;
                }
                else {
                    flag = 0;
                }
                l.add(0, num);
                K/=10;
            }
        }
        if (flag == 1) {
            l.add(0, 1);
        }
        return l;
    }
}
