package Interview.Mathematics.Multiply2String;

import java.math.BigInteger;

class Solution {
    public String multiply(String s1, String s2) {
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger ans = b1.multiply(b2);
        return ans.toString();
    }
}
