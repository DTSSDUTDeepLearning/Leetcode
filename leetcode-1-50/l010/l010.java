package SuanFa.l010;

public class l010 {

    public boolean isMatch(String s, String p) {
        int sl = s.length();
        int pl = p.length();
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();
        if (pl == 0)
            return sl==0;
        if (sl == 0)
        {
            if (pl % 2 == 1)
                return false;
            else
            {
                for (int i = 1;i < pl;i+=2)
                    if (pc[i] != '*')
                        return false;
                return true;
            }
        }
        if (pc[pl-1] == '*')
        {
            if (isMatch(s.substring(0,sl), p.substring(0,pl-2)))
                return true;
            char c0 = pc[pl-2];
            if (c0 == '.')
            {
                for (int i = sl;i >= 0;i--)
                    if (isMatch(s.substring(0,i), p.substring(0,pl-2)))
                        return true;
                return false;
            }
            else
            {
                for (int i = sl;i > 0;i--)
                    if (sc[i - 1] == c0) {
                        if (isMatch(s.substring(0, i-1), p.substring(0, pl - 2)))
                            return true;
                    }
                    else {
                        return false;
                    }
            }
        }
        if (sc[sl-1] == pc[pl-1] || pc[pl-1] == '.')
            return isMatch(s.substring(0,sl-1), p.substring(0,pl-1));
        return false;
    }
}
