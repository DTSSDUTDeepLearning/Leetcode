package l2023;

public class l2023 {

    public int numOfPairs(String[] nums, String target) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 0;i < len;i++) {
            for (int j = 0;j < len;j++) {
                if (i != j && (nums[i] + nums[j]).equals(target)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}