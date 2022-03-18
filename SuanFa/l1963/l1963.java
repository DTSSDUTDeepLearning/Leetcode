package SuanFa.l1963;

public class l1963 {

    public int minSwaps(String s) {
        int cnt = 0;
        int min = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                cnt++;
            }
            else {
                cnt--;
                min = Math.min(min, cnt);
            }
        }
        return (-min+1)/2;
    }
}
