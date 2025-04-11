package l1963;

public class l1963 {

    public int minSwaps(String s) {
        int cnt = 0;
        int minCnt = 0;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == '[') {
                cnt++;
            }
            else {
                cnt--;
                minCnt = Math.min(minCnt, cnt);
            }
        }
        return (-minCnt+1)/2;
    }
}
