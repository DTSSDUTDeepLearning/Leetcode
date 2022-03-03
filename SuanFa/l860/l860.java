package SuanFa.l860;

public class l860 {

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0;i < bills.length;i++) {
            if (bills[i] == 5) {
                five++;
            }
            else if (bills[i] == 10) {
                ten++;
                five--;
            }
            else if (bills[i] == 20) {
                ten--;
                five--;
            }
            if (ten < 0) {
                ten++;
                five-=2;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5,5,5,10,20};
        int[] bills2 = {5,5,10};
        int[] bills3 = {10,10};
        int[] bills4 = {5,5,10,10,20};
        int[] bills5 = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(lemonadeChange(bills1));
        System.out.println(lemonadeChange(bills2));
        System.out.println(lemonadeChange(bills3));
        System.out.println(lemonadeChange(bills4));
        System.out.println(lemonadeChange(bills5));
    }
}
