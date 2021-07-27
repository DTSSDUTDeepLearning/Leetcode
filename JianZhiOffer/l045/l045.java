package JianZhiOffer.l045;

import java.util.Arrays;
import java.util.Comparator;

public class l045 {

    public String minNumber(int[] nums) {
        int len = nums.length;
        String[] strs = new String[len];
        for (int i = 0;i < len;i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        if (strs[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}
