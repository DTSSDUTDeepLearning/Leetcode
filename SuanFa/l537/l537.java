package SuanFa.l537;

public class l537 {

    public static int[] complexNumber(String s) {
        int[] cn = new int[2];
        int index = s.indexOf('+');
        cn[0] = Integer.valueOf(s.substring(0, index));
        cn[1] = Integer.valueOf(s.substring(index+1, s.length()-1));
        return cn;
    }

    public String complexNumberMultiply(String a, String b) {
        int[] cna = complexNumber(a);
        int[] cnb = complexNumber(b);
        int x = cna[0]*cnb[0]-cna[1]*cnb[1];
        int y = cna[0]*cnb[1]+cna[1]*cnb[0];
        return x+"+"+y+"i";
    }
}
