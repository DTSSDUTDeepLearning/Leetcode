package SuanFa.l875;

public class l875 {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        int mid = left+(right-left)/2;
        while (left < right) {
            if (ifcaneat(piles, h, mid)) {
                right = mid;
            }
            else {
                left = mid+1;
            }
            mid = left+(right-left)/2;
        }
        return left;
    }

    public boolean ifcaneat(int[] piles, int h, int K) {
        int time = 0;
        for (int pile : piles) {
            time += ((pile-1)/K+1);
        }
        return time<=h;
    }
}
