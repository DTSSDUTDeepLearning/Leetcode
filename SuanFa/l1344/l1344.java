package SuanFa.l1344;

public class l1344 {

    public double angleClock(int hour, int minutes) {
        if (hour == 12) {
            hour = 0;
        }
        double hour_angel = 30.0*(double)hour + (double)minutes/2.0;
        System.out.println(hour_angel);
        double minute_angel = 6.0*(double)minutes;
        System.out.println(minute_angel);
        double max = Math.max(hour_angel, minute_angel);
        double min = Math.min(hour_angel, minute_angel);
        if (max - min <= 180) {
            return max - min;
        }
        else {
            return 180.0 - max + min;
        }
    }
}
