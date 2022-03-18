package NowCoder.l010;

public class l010 {

    public String solve (String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int lens = ss.length;
        int lent = ts.length;
        int[] ssint = new int[lens];
        int[] tsint = new int[lent];
        for (int i = 0;i < lens;i++) {
            ssint[i] = ss[i]-'0';
        }
        for (int i = 0;i < lent;i++) {
            tsint[i] = ts[i]-'0';
        }
        int[] result = new int[lens+lent];
        for (int i = 0;i < lens;i++) {
            for (int j = 0;j < lent;j++) {
                result[i+j+1]+=(ssint[i]*tsint[j]);
            }
        }
        int sur = 0;
        for (int i = lens+lent-1;i >= 0;i--) {
            int sum = result[i]+sur;
            result[i] = sum % 10;
            sur = sum / 10;
        }
        StringBuilder sb = new StringBuilder();
        int first=0;
        while(first < lens+lent && result[first]==0){
            first++;
        }
        for(int i = first;i < lens+lent;i++){
            sb.append(result[i]);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
