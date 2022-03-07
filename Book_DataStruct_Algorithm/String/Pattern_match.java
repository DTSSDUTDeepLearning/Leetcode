package Book_DataStruct_Algorithm.String;

import java.util.Arrays;

public class Pattern_match {

    public static void main(String[] args) {
        String target = "ABCABCABCEABCAEBCABCABCDABCABCABCDEABC";
        String pattern = "ABCABCABCD";
        System.out.print("使用朴素匹配方法得到的结果为：");
        System.out.printf("在target中匹配pattern的起始位置为%d\n", simple_match(target, pattern));
        int[] next = next(pattern);
        System.out.print("pattern的next数组的值为：");
        System.out.println(Arrays.toString(next));
        System.out.print("使用KMP匹配方法得到的结果为：");
        System.out.printf("在target中匹配pattern的起始位置为%d\n", KMP(target, pattern, next, 0));

    }

    public static int simple_match(String T, String P) {
        int t = 0;
        int p = 0;
        char[] ts = T.toCharArray();
        int tlen = ts.length;
        char[] ps = P.toCharArray();
        int plen = ps.length;
        while (t < tlen && p < plen) {
            if (ts[t] == ps[p]) {
                t++;
                p++;
            }
            else {
                t = t-p+1;
                p = 0;
            }
        }
        if (p >= plen) {
            return t-plen;
        }
        else {
            return -1;
        }
    }

    public static int KMP(String T, String P, int[] next, int start) {
        char[] ts = T.toCharArray();
        char[] ps = P.toCharArray();
        int tlen = ts.length;
        int plen = ps.length;
        int last = tlen - plen;
        if (last - start < 0) {
            return -1;
        }
        int j = 0;
        for (int i = start;i < tlen;i++) {
            while (j > 0 && ps[j] != ts[i]) {
                j = next[j-1];
            }
            if (ps[j] == ts[i]) {
                j++;
            }
            if (j == plen) {
                return i-j+1;
            }
        }
        return -1;
    }

    public static int[] next(String P) {
        char[] ps = P.toCharArray();
        int len = ps.length;
        int[] results = new int[len];
        results[0] = 0;
        for (int i = 1;i < len;i++) {
            int k = results[i-1];
            if (ps[i]==ps[k]) {
                results[i] = k+1;
            }
            else if (k != 0) {
                results[i] = results[k-1];
            }
            else {
                results[i] = 0;
            }
        }
        return results;
    }
}
