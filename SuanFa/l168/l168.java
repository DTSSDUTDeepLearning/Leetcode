package SuanFa.l168;

public class l168 {
    public static String convertToTitle(int n) {
        String title = "";
        while (n != 0) {
            n--;
            title = (char)(65+n%26) + title;
            n /= 26;
        }
        return title;
    }

    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 28;
        int a3 = 701;
        System.out.println(convertToTitle(a1));
        System.out.println(convertToTitle(a2));
        System.out.println(convertToTitle(a3));
    }
}
