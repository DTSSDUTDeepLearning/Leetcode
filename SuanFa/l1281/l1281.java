package SuanFa.l1281;

public class l1281 {

    public int subtractProductAndSum(int n) {
        int mul = 1;
        int add = 0;
        while (n > 0) {
            add += n % 10;
            mul *= n % 10;
            n /= 10;
        }
        return mul-add;
    }
}
