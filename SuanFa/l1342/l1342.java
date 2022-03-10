package SuanFa.l1342;

public class l1342 {

    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int cnt = -1;
        while (num != 0) {
            if ((num & 1) == 0) {
                cnt+=1;
            }
            else {
                cnt+=2;
            }
            num>>=1;
        }
        return cnt;
    }
}
