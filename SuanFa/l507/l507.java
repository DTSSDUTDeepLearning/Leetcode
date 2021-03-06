package SuanFa.l507;

public class l507 {

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        int i = 2;
        for (; i * i < num; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        if (i*i == num) {
            sum+=i;
        }
        return sum == num;
    }
}
