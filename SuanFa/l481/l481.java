package SuanFa.l481;

public class l481 {

    public int magicalString(int n) {
        if (n < 3) {
            return 1;
        }
        char[] result = new char[n];
        result[0] = '1';
        result[1] = '2';
        result[2] = '2';
        int slow = 2;
        int fast = 3;
        boolean flag = true; // flag为true代表接下来添加1，否则添加2
        int sum = 1;
        while (fast < n) {
            if (flag) {
                if (result[slow] == '2') {
                    result[fast++] = '1';
                    sum++;
                }
                if (fast == n) {
                    return sum;
                }
                result[fast++] = '1';
                sum++;
            }
            else {
                if (result[slow] == '2') {
                    result[fast++] = '2';
                }
                if (fast == n) {
                    return sum;
                }
                result[fast++] = '2';
            }
            slow++;
            flag = !flag;
        }
        return sum;
    }
}
