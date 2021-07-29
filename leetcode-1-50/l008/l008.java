package SuanFa.l008;

public class l008 {

    public int myAtoi(String str) {
        char[] cs = str.toCharArray();
        String r = "";
        boolean positive = true;
        long re = 0;
        int ri = 0;
        int first = 0;
        for (first = 0;first < cs.length;first++)
        {
            if (cs[first] != ' ')
                break;
        }
        if (first == cs.length)
            return 0;
        if (cs[first] == '+' || cs[first] == '-')
        {
            if (first+1 == cs.length)
                return 0;
            if (cs[first] == '-')
                positive = false;
            if (cs[first+1]>='0' && cs[first+1]<='9')
            {
                int i = first+1;
                while (i < cs.length && cs[i]>='0' && cs[i]<='9')
                {
                    r += str.substring(i, i+1);
                    i++;
                }
            }
            else
            {
                return 0;
            }
        }
        else if (cs[first]>='0' && cs[first]<='9')
        {
            int i = first;
            while (i < cs.length && cs[i]>='0' && cs[i]<='9')
            {
                r += str.substring(i, i+1);
                i++;
            }
        }
        else
        {
            return 0;
        }

        cs = r.toCharArray();
        int i = 0;
        for (i = 0;i < r.length();i++)
            if (cs[i] != '0')
                break;

        if (r.length() - i - 1 > 10)
        {
            if (positive)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }
        try {
            re=Long.parseLong(r); //转换时，会自动去掉字符串前几位的0
        } catch (Exception e){}
        if (positive)
        {
            if (re >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
            {
                ri = (int) re;
                return ri;
            }
        }
        else if (re-1>=Integer.MAX_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            ri = (int) re;
            return 0-ri;
        }
    }
}
