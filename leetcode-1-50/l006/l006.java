package SuanFa.l006;

public class l006 {

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int k = numRows * 2 - 2;
        String[] res=new String[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = "";
        }
        int step = 0;
        int j;
        for (int i = 0; i < s.length(); i++) {
            step++;
            if (step <= numRows) {
                j = step;
            }
            else{
                j = numRows - (step - numRows);
            }
            res[j-1] += s.substring(i, i+1);
            if (step == k) {
                step = 0;
            }
        }
        String result="";
        for (int i = 0; i < numRows; i++) {
            result += res[i];
        }
        return result;
    }
}
