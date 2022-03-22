package NowCoder.l073;

public class l073 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int candi = array[0];
        int cnt = 0;
        for (int num : array) {
            if (cnt == 0) {
                candi = num;
                cnt++;
            }
            else if (num == candi) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        cnt = 0;
        for (int num : array) {
            if (num == candi) {
                cnt++;
            }
        }
        return (2*cnt > array.length)?candi:0;
    }
}
