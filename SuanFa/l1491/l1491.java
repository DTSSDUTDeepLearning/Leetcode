package SuanFa.l1491;

public class l1491 {

    public double average(int[] salary) {
        int max = 999;
        int min = 1000001;
        int sum = 0;
        for (int s : salary) {
            sum += s;
            max = Math.max(max, s);
            min = Math.min(min, s);
        }
        return (double)(sum-max-min)/(salary.length-2);
    }
}
