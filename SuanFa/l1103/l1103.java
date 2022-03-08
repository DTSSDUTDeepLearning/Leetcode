package SuanFa.l1103;

import java.util.Arrays;

public class l1103 {

    public static int[] distributeCandies(int candies, int num_people) {
        long m = (long)candies;
        long n = (long)num_people;
        long k = (long)Math.floor((Math.sqrt(8*m+1)-1)/(2*n));
//        System.out.println("k="+k);
        int remain = (int)(m-(n*k)*(n*k+1)/2);
//        System.out.println("remain1="+remain);
        int t = (int)Math.floor(Math.sqrt(k*k*n*n+k*n+2*remain+0.25)-k*n-0.5);
//        System.out.println("t="+t);
        remain = remain-(int)(k*n*t)-(t+1)*t/2;
//        System.out.println("remain="+remain);
        int[] results = new int[num_people];
        for (int i = 1;i <= t;i++) {
            results[i-1] = (int)((n*k+2*i)*(k+1)/2);
        }
        if (t != num_people) {
            results[t] = (int)((n*(k-1)+2*(t+1))*k/2+remain);
        }
        for (int i = t+2;i <= num_people;i++) {
            results[i-1] = (int)((n*(k-1)+2*i)*k/2);
        }
        return results;
    }

    public static void main(String[] args) {
        int m1 = 6;
        int n1 = 3;
        System.out.println(Arrays.toString(distributeCandies(m1, n1)));
        int m2 = 9;
        int n2 = 3;
        System.out.println(Arrays.toString(distributeCandies(m2, n2)));
        int m3 = 10;
        int n3 = 3;
        System.out.println(Arrays.toString(distributeCandies(m3, n3)));
        int m4 = 11;
        int n4 = 3;
        System.out.println(Arrays.toString(distributeCandies(m4, n4)));
        int m5 = 16;
        int n5 = 3;
        System.out.println(Arrays.toString(distributeCandies(m5, n5)));
        int m6 = 20;
        int n6 = 3;
        System.out.println(Arrays.toString(distributeCandies(m6, n6)));
        int m7 = 21;
        int n7 = 3;
        System.out.println(Arrays.toString(distributeCandies(m7, n7)));
        int m8 = 22;
        int n8 = 3;
        System.out.println(Arrays.toString(distributeCandies(m8, n8)));
        int m9 = 7;
        int n9 = 4;
        System.out.println(Arrays.toString(distributeCandies(m9, n9)));
        int m10 = 5;
        int n10 = 4;
        System.out.println(Arrays.toString(distributeCandies(m10, n10)));
    }

}
