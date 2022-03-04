package SuanFa.l949;

public class l949 {

    public String largestTimeFromDigits(int[] arr) {
        int result = -1;
        for (int i = 0;i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                if (j != i) {
                    for (int k = 0;k < 4;k++) {
                        if (k != i && k != j) {
                            int l = 6 - i - j - k;
                            int hours = 10 * arr[i] + arr[j];
                            int mins = 10 * arr[k] + arr[l];
                            if (hours < 24 && mins < 60)
                                result = Math.max(result, hours * 60 + mins);
                        }
                    }
                }
            }
        }
        return result >= 0 ? String.format("%02d:%02d", result / 60, result % 60) : "";
    }
}
