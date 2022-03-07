package MianShiTi.t17.l010;

public class l010 {

    public int majorityElement(int[] nums) {
        int candidate = -1;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                candidate = num;
            }
            if (candidate == num) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        cnt = 0;
        for (int num : nums) {
            if (num == candidate) {
                cnt++;
            }
        }
        return cnt * 2 > nums.length ? candidate : -1;
    }
}
