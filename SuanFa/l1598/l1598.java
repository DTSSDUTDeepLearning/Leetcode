package SuanFa.l1598;

public class l1598 {

    public int minOperations(String[] logs) {
        int dep = 0;
        for (String log : logs) {
            if (log.charAt(0) == '.') {
                if (log.charAt(1) == '.' && dep > 0) {
                    dep--;
                }
            }
            else {
                dep++;
            }
        }
        return dep;
    }
}
