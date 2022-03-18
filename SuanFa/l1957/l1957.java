package SuanFa.l1957;

public class l1957 {

    public String makeFancyString(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < len-2) {
            if (cs[index] != cs[index+1]) {
                sb.append(cs[index++]);
            }
            else if (cs[index] != cs[index+2]) {
                sb.append(cs[index]);
                sb.append(cs[index]);
                index+=2;
            }
            else {
                int index_tmp = index + 3;
                while (index_tmp < len && cs[index] == cs[index_tmp]) {
                    index_tmp++;
                }
                sb.append(cs[index]);
                sb.append(cs[index]);
                index = index_tmp;
            }
        }
        if (index == len-2) {
            sb.append(cs[index]);
            sb.append(cs[index+1]);
        }
        else if (index == len-1) {
            sb.append(cs[index]);
        }
        return sb.toString();
    }
}
