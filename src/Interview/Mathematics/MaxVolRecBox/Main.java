package Interview.Mathematics.MaxVolRecBox;

public class Main {
    static long getVol(int A, int B) {
        double p = (double)A;
        double s = (double)B;

        double v = (36*p*s - Math.pow(p, 3) + Math.sqrt(Math.pow((p*p - 24*s), 3))) / (12*72);
        long ans  =  (long)(v);
        if (ans<0)
            ans=0;
        return ans;
    }
}
