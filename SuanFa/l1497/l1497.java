package SuanFa.l1497;

public class l1497 {

    public boolean canArrange(int[] arr, int k) {
        int[] mod = new int[k];
        for (int num : arr) {
            mod[(num%k+k)%k]++;
        }
        if (mod[0] % 2 != 0 || k % 2 == 0 && mod[k/2] % 2 != 0) {
            return false;
        }
        for (int i = 1;2*i < k;i++) {
            if (mod[i] != mod[k-i]) {
                return false;
            }
        }
        return true;
    }
}
