package SuanFa.l1904;

public class l1904 {

    public int numberOfRounds(String startTime, String finishTime) {
        char[] cs = startTime.toCharArray();
        int hour = (cs[0] - '0') * 10 + cs[1] - '0';
        int minute = (cs[3] - '0') * 10 + cs[4] - '0';
        int startRound = hour * 4 + minute / 15 + 1;
        if (minute % 15 == 0) {
            startRound--;
        }
        cs = finishTime.toCharArray();
        hour = (cs[0] - '0') * 10 + cs[1] - '0';
        minute = (cs[3] - '0') * 10 + cs[4] - '0';
        int finishRound = hour * 4 + minute / 15;
        if (startTime.compareTo(finishTime) < 0) {
            return Math.max(finishRound - startRound, 0);
        }
        else {
            return finishRound + 96 - startRound;
        }
    }
}
