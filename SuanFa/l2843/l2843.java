package l2843;

public class l2843 {

    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for (int i = low;i <= high;i++) {
            if (i < 100 && i % 11 == 0) {
                cnt++;
            }
            else if (i >= 1000 && i < 10000) {
                int left = i/1000+(i%1000)/100;
                int right = (i%100)/10+i%10;
                if (left == right) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
