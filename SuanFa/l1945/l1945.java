package SuanFa.l1945;

public class l1945 {

    public int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c - 'a' < 9) {
                sum += (c - 'a' + 1);
            }
            else if (c - 'a' < 19) {
                sum += (c - 'a' - 8);
            }
            else {
                sum += (c - 'a' - 17);
            }
        }
        for (int i = 1;i < k;i++) {
            int tmp = 0;
            while (sum != 0) {
                tmp += sum % 10;
                sum /= 10;
            }
            sum = tmp;
            if (sum < 10) {
                return sum;
            }
        }
        return sum;
    }
}
