package SuanFa.l678;

public class l678 {

    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            }
            else if (c == ')') {
                min = min == 0 ? 0 : min-1;
                max--;
                if (max < 0) {
                    return false;
                }
            }
            else {
                min = min == 0 ? 0 : min-1;
                max++;
            }
        }
        return min == 0;
    }
}
