package SuanFa.l1363;

public class l1363 {

    public String largestMultipleOfThree(int[] digits) {
        int[] cnt = new int[10];
        int[] mod = new int[3];
        int sum = 0;
        for (int d : digits) {
            cnt[d]++;
            mod[d%3]++;
            sum+=d;
        }
        if (sum % 3 == 1) {
            if (mod[1] != 0) {
                for (int i = 1;i < 9;i+=3) {
                    if (cnt[i] != 0) {
                        cnt[i]--;
                        break;
                    }
                }
            }
            else {
                for (int time = 0;time < 2;time++) {
                    for (int i = 2;i < 9;i+=3) {
                        if (cnt[i] != 0) {
                            cnt[i]--;
                            break;
                        }
                    }
                }
            }
        }
        else if (sum % 3 == 2) {
            if (mod[2] != 0) {
                for (int i = 2;i < 9;i+=3) {
                    if (cnt[i] != 0) {
                        cnt[i]--;
                        break;
                    }
                }
            }
            else {
                for (int time = 0;time < 2;time++) {
                    for (int i = 1;i < 9;i+=3) {
                        if (cnt[i] != 0) {
                            cnt[i]--;
                            break;
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9;i >= 0;i--) {
            for (int j = 0;j < cnt[i];j++) {
                sb.append(i);
            }
        }
        if (sb.length() > 0 && sb.charAt(0) == '0') {
            return "0";
        }
        else {
            return sb.toString();
        }
    }
}
