package SuanFa.l457;

public class l457 {

    int[] arr;
    int len;

    public boolean circularArrayLoop(int[] nums) {
        arr = nums;
        len = arr.length;
        for (int i = 0;i < len;i++) {
            if (nums[i] == 0) {
                continue;
            }
            int slow = i;
            int fast = next(i);
            while (arr[slow] * arr[fast] > 0 && arr[slow] * arr[next(fast)] > 0) {
                if (slow == fast) {
                    if (slow != next(slow)) {
                        return true;
                    }
                    else {
                        break;
                    }
                }
                slow = next(slow);
                fast = next(next(fast));
            }
            int index = i;
            while (nums[index] * nums[next(index)] > 0) {
                int tmp = index;
                index = next(index);
                nums[tmp] = 0;
            }
        }
        return false;
    }

    public int next(int index) {
        return ((index + arr[index]) % len + len) % len;
    }
}
