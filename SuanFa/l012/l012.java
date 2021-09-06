package SuanFa.l012;

public class l012 {

    public String intToRoman(int num) {
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String r = "";
        for (int i = 0;i < 13;i++)
            while (num >= a[i])
            {
                num -= a[i];
                r += s[i];
            }
        return r;
    }
}
