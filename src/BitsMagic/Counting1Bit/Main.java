package BitsMagic.Counting1Bit;

public class Main {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i=0;i<=n;i++){
            a[i]=a[i>>1]+(i&1);  //shifting & checking 1 or 0
        }
        return a;
    }
}
