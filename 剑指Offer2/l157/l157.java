package SuanFaPlus.l157;

public class l157 extends Reader {
    public int read(char[] buf, int n) {
        int idx = 0;
        char[] buf4 = new char[4];
        int size = read4(buf4);
        while (size > 0 && idx < n) {
            for (int i = 0; i < size && idx < n; ++i) buf[idx++] = buf4[i];
            size = read4(buf4);
        }
        return idx;
    }
}
