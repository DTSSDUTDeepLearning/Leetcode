package SuanFa.l1185;

public class l1185 {

    // Zeller公式：w=y+[y/4]+[c/4]-2c+[26(m+1)/10]+d-1 (m如果为1，转化为13；如果为2，转化为14)
    public String dayOfTheWeek(int day, int month, int year) {
        String[] results = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (month <= 2) {
            month+=12;
            year--;
        }
        int y = year % 100;
        int c = year / 100;
        int w = (y+y/4+c/4-2*c+26*(month+1)/10+day-1)%7;
        return results[w>0?w:w+7];
    }
}
