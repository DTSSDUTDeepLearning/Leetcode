package SuanFa.l640;

public class l640 {

    public String solveEquation(String equation) {
        String[] strings = equation.split("=");
        int[] left = huajian(strings[0].toCharArray());
        int[] right = huajian(strings[1].toCharArray());
        if (left[1] == right[1]) {
            if (left[0] == right[0]) {
                return "Infinite solutions";
            }
            else {
                return "No solution";
            }
        }
        else {
            return "x="+(right[0]-left[0])/(left[1]-right[1]);
        }
    }

    public int[] huajian(char[] cs) {
        int len = cs.length;
        int zero = 0;
        int one = 0;
        int index = 0;
        boolean flag1 = true; // 判断前一个是+还是-，+为true，-为false
        if (cs[0] == '-') {
            index++;
            flag1 = false;
        }
        while (index < len) {
            int num = 0;
            boolean flag2 = true; // 判断当前元是0次还是1次，0次为true，1次为false
            while (index < len && cs[index] != '-' && cs[index] != '+') {
                if (cs[index] == 'x') {
                    flag2 = false;
                    if (index == 0 || cs[index-1] == '-' || cs[index-1] == '+') {
                        num = 1;
                    }
                }
                else {
                    num = num * 10 + cs[index] - '0';
                }
                index++;
            }
            if (flag1) {
                if (flag2) {
                    zero+=num;
                }
                else {
                    one+=num;
                }
            }
            else {
                if (flag2) {
                    zero-=num;
                }
                else {
                    one-=num;
                }
            }
            if (index < len) {
                flag1 = cs[index++] == '+';
            }
        }
        return new int[]{zero, one};
    }
}
