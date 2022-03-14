package SuanFa.l1716;

public class l1716 {

    public static int totalMoney(int n) {
        int week = n / 7;
        int day = n % 7;
        return 28*week + week*(week-1)*7/2 + (week+1)*day + day*(day-1)/2;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 10;
        int n3 = 20;
        int n4 = 1000;
        int n5 = 1;
        System.out.println(totalMoney(n1));
        System.out.println(totalMoney(n2));
        System.out.println(totalMoney(n3));
        System.out.println(totalMoney(n4));
        System.out.println(totalMoney(n5));
    }
}
