package SuanFa.l1551;

public class l1551 {

    public int minOperations(int n) {
        return n%2==0?n*n/4:(n+1)*(n-1)/4;
    }
}
