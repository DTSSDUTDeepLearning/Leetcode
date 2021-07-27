package JianZhiOffer.l016;

public class l016 {

    public double myPow(double x, int n) {
        int logits = n;
        double result = 1.0000;
        while (logits != 0) {
            if (logits % 2 != 0) {
                result *= x;
            }
            x = x * x;
            logits /= 2;
        }
        return (n<0)?1.0000/result:result;
    }
}
