package NowCoder.l079;

public class l079 {

    public int GetUglyNumber_Solution(int index) {
        int cnt = 0;
        int k = 1;
        while (cnt < index) {
            if (isUgly(k)) {
                cnt++;
            }
        }
        return k;
    }

    public boolean isUgly(int index) {
        while (index % 2 == 0) {
            index/=2;
        }
        while (index % 3 == 0) {
            index/=3;
        }
        while (index % 5 == 0) {
            index/=5;
        }
        return index==1;
    }
}
