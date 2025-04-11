package l2007;

public class l2007 {

    public int[] findOriginalArray(int[] changed) {
        int len = changed.length;
        if (len % 2 == 1) {
            return new int[]{};
        }
        int max = 0;
        for (int num : changed) {
            max = Math.max(num, max);
        }
        int[] cnt = new int[max+1];
        for (int num : changed) {
            cnt[num]++;
        }

        int[] result = new int[len/2];
        int index = 0;
        for (int i = max;i >= 0;i--) {
            if (cnt[i] != 0) {
                if (i % 2 == 1) {
                    return new int[]{};
                }
                else {
                    if (cnt[i / 2] >= cnt[i]) {
                        cnt[i / 2] -= cnt[i];
                        for (int j = 0;j < cnt[i];j++) {
                            result[index++] = i / 2;
                        }
                    }
                    else {
                        return new int[]{};
                    }
                }
            }
        }
        return result;
    }
}
