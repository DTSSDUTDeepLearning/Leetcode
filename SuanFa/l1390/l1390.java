package SuanFa.l1390;

public class l1390 {

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int sqr = (int)Math.ceil(Math.sqrt(num));
            if (num % sqr != 0) {
                int cnt = 0;
                int div = 0;
                for (int i = sqr-1;i > 1;i--) {
                    if (num % i == 0) {
                        if (cnt == 1) {
                            cnt++;
                            break;
                        }
                        cnt++;
                        div = i;
                    }
                }
                if (cnt == 1) {
                    sum += 1+num+div+num/div;
                }
            }
            else if (num == 6) {
                sum+=12;
            }
        }
        return sum;
    }
}
