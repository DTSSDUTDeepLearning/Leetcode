package SuanFa.l1894;

public class l1894 {

    public int chalkReplacer(int[] chalk, int k) {
        int len = chalk.length;
        long sum = 0;
        for (int c : chalk) {
            sum += c;
        }
        sum = k % sum;
        for (int i = 0;i < len;i++) {
            sum-=chalk[i];
            if (sum < 0) {
                return i;
            }
        }
        return -1;
    }
}
