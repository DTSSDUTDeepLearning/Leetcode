package SuanFa.l189;

public class l189_1 {

    // 使用环形数组的方法
    public static int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int count = gcd(k, len);
        for (int i = 0;i < count;i++) {
            int curr = i;
            int prev = nums[i];
            do {
                int next = (curr + k) % len;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                curr = next;
            } while (curr != i);
        }
    }
}
