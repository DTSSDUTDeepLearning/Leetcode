package SuanFa.l1154;

public class l1154 {

    public int dayOfYear(String date) {
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8, 10));
        if (month == 1) {
            return day;
        }
        else if (month == 2) {
            return 31+day;
        }
        else if (year % 4 == 0 && year % 100 != 0 || year % 400 != 0) {
            if (month == 3) {
                return 60+day;
            }
            else if (month == 4) {
                return 91+day;
            }
            else if (month == 5) {
                return 121+day;
            }
            else if (month == 6) {
                return 152+day;
            }
            else if (month == 7) {
                return 182+day;
            }
            else if (month == 8) {
                return 213+day;
            }
            else if (month == 9) {
                return 244+day;
            }
            else if (month == 10) {
                return 274+day;
            }
            else if (month == 11) {
                return 305+day;
            }
            else {
                return 335+day;
            }
        }
        else {
            if (month == 3) {
                return 59+day;
            }
            else if (month == 4) {
                return 90+day;
            }
            else if (month == 5) {
                return 120+day;
            }
            else if (month == 6) {
                return 151+day;
            }
            else if (month == 7) {
                return 181+day;
            }
            else if (month == 8) {
                return 212+day;
            }
            else if (month == 9) {
                return 243+day;
            }
            else if (month == 10) {
                return 273+day;
            }
            else if (month == 11) {
                return 304+day;
            }
            else {
                return 334+day;
            }
        }
    }
}
