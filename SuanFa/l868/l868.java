package SuanFa.l868;

public class l868 {

    public int binaryGap(int n) {
        int last = -1;
        int dis = 0;
        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) > 0) {
                if (last >= 0)
                    dis = Math.max(dis, i - last);
                last = i;
            }
        return dis;
    }
}
