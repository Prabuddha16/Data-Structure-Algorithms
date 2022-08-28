package Interview.Basic.BalancedArray;

public class Main {
    long minValueToBalance(long a[] ,int n)
    {
        long sumOfLeft=0;
        long sumOfRight=0;
        for(int i=0;i<n/2;i++){
            sumOfLeft+=a[i];
            sumOfRight+=a[n/2+i];
        }
        return sumOfLeft>sumOfRight?sumOfLeft-sumOfRight:sumOfRight-sumOfLeft;

    }
}
