package JianZhiOffer.l064;

public class l064 {

    int[] test = new int[]{0};

    public int sumNums(int n) {
        try{
            return test[n];
        } catch(Exception e) {
            return n+sumNums(n-1);
        }
    }
}
