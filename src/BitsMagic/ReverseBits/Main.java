package BitsMagic.ReverseBits;

public class Main {
    public int reverseBits(int n)
    {
        int ans = 0;
        while(n>0)
        {
            ans <<= 1;
            ans = ans | (n&1);
            n >>= 1;
        }

        return ans;
    }
}
