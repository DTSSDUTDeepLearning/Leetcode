package SuanFa.l223;

public class l223 {

    public static int calS(int A, int B, int C, int D) {
        return (C-A)*(D-B);
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (A > E) {
            int tmp = A;
            A = E;
            E = tmp;
            tmp = B;
            B = F;
            F = tmp;
            tmp = C;
            C = G;
            G = tmp;
            tmp = D;
            D = H;
            H = tmp;
        }
        if (F >= D || H <= B || E >= C) {
            return calS(A,B,C,D)+calS(E,F,G,H);
        }
        if (F >= B) {
            if (G < C) {
                if (H >= D) {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,F,G,D);
                }
                else {
                    return calS(A,B,C,D);
                }
            }
            else {
                if (H >= D) {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,F,C,D);
                }
                else {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,F,C,H);
                }
            }
        }
        else {
            if (G < C) {
                if (H >= D) {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,B,G,D);
                }
                else {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,B,G,H);
                }
            }
            else {
                if (H >= D) {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,B,C,D);
                }
                else {
                    return calS(A,B,C,D)+calS(E,F,G,H)-calS(E,B,C,H);
                }
            }
        }
    }
}
