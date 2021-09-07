package SuanFa.l060;

import java.util.LinkedList;
import java.util.List;

public class l060 {

    public String getPermutation(int n, int k) {
        int[] jiecheng = {1,1,2,6,24,120,720,5040,40320,362880};
        k--;
        StringBuilder sb = new StringBuilder();
        List<Integer> l = new LinkedList<>();
        for (int i = 1;i <= n;i++) {
            l.add(i);
        }
        for (int i = 0;i < n;i++) {
            sb.append(l.get(k / jiecheng[n-i-1]));
            l.remove(k / jiecheng[n-i-1]);
            k = k % jiecheng[n-i-1];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        l060 l = new l060();
        int n1 = 3;
        int k1 = 3;
        int n2 = 4;
        int k2 = 9;
        int n3 = 3;
        int k3 = 1;
        System.out.println(l.getPermutation(n1, k1));
        System.out.println(l.getPermutation(n2, k2));
        System.out.println(l.getPermutation(n3, k3));
    }
}
