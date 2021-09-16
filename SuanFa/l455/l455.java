package SuanFa.l455;

import java.util.Arrays;

public class l455 {

    public static int findContentChildren(int[] g, int[] s) {
        int len1 = g.length;
        int len2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < len1) {
            while (j < len2 && g[i] > s[j]) {
                j++;
            }
            if (j == len2) {
                break;
            }
            else {
                i++;
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g1 = {1,2,3};
        int[] s1 = {1,1};
        int[] g2 = {1,2};
        int[] s2 = {1,2,3};
        int[] g3 = {1,2};
        int[] s3 = {};
        int[] g4 = {1,2,3};
        int[] s4 = {3};
        int[] g5 = {5,8};
        int[] s5 = {1,2,4,6};
        System.out.println(findContentChildren(g1, s1));
        System.out.println(findContentChildren(g2, s2));
        System.out.println(findContentChildren(g3, s3));
        System.out.println(findContentChildren(g4, s4));
        System.out.println(findContentChildren(g5, s5));
    }
}
