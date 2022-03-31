package NowCoder.l529;

public class l529 {

    public long Pokemonfight (long HP, long ACK, long HP2, long ACK2) {
        if (ACK >= HP2 || 2 * ACK >= HP2 && ACK2 < HP) {
            return -1;
        }
        else if (ACK2 >= HP) {
            return 1;
        }
        long times = (HP2-1) / ACK;
        if (times * ACK2 >= HP) {
            return (HP - 1) / ACK2 + 1;
        }
        HP -= times * ACK2;
        long times_ACK = (times - 1) * ACK2;
        if (HP % times_ACK == 0) {
            return times + HP / times_ACK * times;
        }
        else {
            return times + HP / times_ACK * times + (HP % times_ACK-1) / ACK2 + 2;
        }
    }
}
