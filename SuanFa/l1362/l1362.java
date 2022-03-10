package SuanFa.l1362;

public class l1362 {

    public int[] closestDivisors(int num) {
        int[] n1 = div(num+1);
        int[] n2 = div(num+2);
        return n1[1]-n1[0] < n2[1]-n2[0]?n1:n2;
    }

    public int[] div(int n) {
        for (int i = (int)Math.sqrt(n);i >= 2;i--) {
            if (n % i == 0) {
                return new int[]{i, n/i};
            }
        }
        return new int[]{1, n};
    }
}
