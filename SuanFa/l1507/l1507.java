package SuanFa.l1507;

public class l1507 {

    public String reformatDate(String date) {
        String[] dates = date.split(" ");
        StringBuilder sb = new StringBuilder(dates[2]);
        sb.append('-');
        if (dates[1].equals("Jan")) {
            sb.append("01");
        }
        else if (dates[1].equals("Feb")) {
            sb.append("02");
        }
        else if (dates[1].equals("Mar")) {
            sb.append("03");
        }
        else if (dates[1].equals("Apr")) {
            sb.append("04");
        }
        else if (dates[1].equals("May")) {
            sb.append("05");
        }
        else if (dates[1].equals("Jun")) {
            sb.append("06");
        }
        else if (dates[1].equals("Jul")) {
            sb.append("07");
        }
        else if (dates[1].equals("Aug")) {
            sb.append("08");
        }
        else if (dates[1].equals("Sep")) {
            sb.append("09");
        }
        else if (dates[1].equals("Oct")) {
            sb.append("10");
        }
        else if (dates[1].equals("Nov")) {
            sb.append("11");
        }
        else if (dates[1].equals("Dec")) {
            sb.append("12");
        }
        sb.append('-');
        char c = dates[0].charAt(1);
        if (c >= '0' && c <= '9') {
            sb.append(dates[0].substring(0,2));
        }
        else {
            sb.append('0');
            sb.append(dates[0].charAt(0));
        }
        return sb.toString();
    }
}
