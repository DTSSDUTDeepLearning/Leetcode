package SuanFa.l1419;

public class l1419 {

    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] croak = new int[5];
        if (croakOfFrogs.charAt(0) != 'c') {
            return -1;
        }
        int num = 1;
        for (char c : croakOfFrogs.toCharArray()) {
            if (c == 'c') {
                if (croak[0]+croak[1]+croak[2]+croak[3] == num) {
                    num++;
                }
                croak[0]++;
            }
            else if (c == 'r') {
                if (croak[0] == 0) {
                    return -1;
                }
                croak[0]--;
                croak[1]++;
            }
            else if (c == 'o') {
                if (croak[1] == 0) {
                    return -1;
                }
                croak[1]--;
                croak[2]++;
            }
            else if (c == 'a') {
                if (croak[2] == 0) {
                    return -1;
                }
                croak[2]--;
                croak[3]++;
            }
            else if (c == 'k') {
                if (croak[3] == 0) {
                    return -1;
                }
                croak[3]--;
                croak[4]++;
            }
        }
        if (croak[0] != 0 || croak[1] != 0 || croak[2] != 0 || croak[3] != 0) {
            return -1;
        }
        else {
            return num;
        }
    }
}
