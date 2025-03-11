package l2241;

public class l2241 {
}

class ATM {

    int[] cnt;

    public ATM() {
        cnt = new int[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0;i < 5;i++) {
            cnt[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] def = new int[1];
        def[0] = -1;
        if (amount % 10 != 0) {
            return def;
        }

        int[] result = new int[5];
        int[] nums = {20, 50, 100, 200, 500};
        for (int i = 4;i >= 0;i--) {
            result[i] = Math.min(amount / nums[i], cnt[i]);
            amount -= nums[i] * result[i];
        }
        if (amount != 0) {
            return def;
        }
        else {
            for (int i = 0;i < 5;i++) {
                cnt[i] -= result[i];
            }
            return result;
        }
    }
}