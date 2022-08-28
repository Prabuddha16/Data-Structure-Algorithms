package Interview.Mathematics.Factorial;

import java.math.BigInteger;

public class Main {
    static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
