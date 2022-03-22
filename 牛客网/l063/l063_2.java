package NowCoder.l063;

import java.util.Arrays;

public class l063_2 {

    // 排序+遍历
    public boolean IsContinuous(int [] numbers) {
        if (numbers.length < 5) {
            return false;
        }
        Arrays.sort(numbers);
        int joker = numbers[0]==0?1:0;
        for (int i = 1;i < 5;i++) {
            if (numbers[i] == 0) {
                joker++;
            }
            else if (numbers[i] == numbers[i-1]) {
                return false;
            }
        }
        return numbers[4]-numbers[joker]<5;
    }
}
