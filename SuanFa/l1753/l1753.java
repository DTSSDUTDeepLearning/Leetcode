package SuanFa.l1753;

public class l1753 {

    public int maximumScore(int a, int b, int c) {
        int one;
        int two;
        int three;
        if (a > b) {
            if (a > c) {
                one = a;
                if (b > c) {
                    two = b;
                    three = c;
                }
                else {
                    two = c;
                    three = b;
                }
            }
            else {
                one = c;
                two = a;
                three = b;
            }
        }
        else {
            if (b > c) {
                one = b;
                if (a > c) {
                    two = a;
                    three = c;
                }
                else {
                    two = c;
                    three = a;
                }
            }
            else {
                one = c;
                two = b;
                three = a;
            }
        }
        if (one >= two + three) {
            return two + three;
        }
        else {
            return (one + two + three) / 2;
        }
    }
}
