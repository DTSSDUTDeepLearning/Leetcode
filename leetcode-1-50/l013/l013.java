package SuanFa.l013;

import java.util.ArrayList;
import java.util.List;

public class l013 {

    public int romanToInt(String s) {
        List<Character> steps = new ArrayList<>();
        steps.add('I');
        steps.add('V');
        steps.add('X');
        steps.add('L');
        steps.add('C');
        steps.add('D');
        steps.add('M');
        int[] nums = {1,5,10,50,100,500,1000};
        char[] sc = s.toCharArray();
        int sl = s.length();

        int step = steps.indexOf(sc[sl-1]);
        //System.out.println(step);
        int n = nums[step];

        for (int i = sl-2;i >= 0;i--)
        {
            int index = steps.indexOf(sc[i]);
            if (step <= index)
            {
                step = index;
                n += nums[step];
            }
            else
                n -= nums[index];
        }

        return n;
    }
}
