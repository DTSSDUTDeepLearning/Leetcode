package SuanFa.l1518;

public class l1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles>=numExchange ? (numBottles-numExchange)/(numExchange-1)+1+numBottles : numBottles;
    }
}
