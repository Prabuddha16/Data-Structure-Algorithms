package ArrayQues.PerfectArray;

public class Main {
    public boolean IsPerfect(int[] a, int n)
    {
        for(int i=0,j=n-1;i<n;i++){
            if(a[i]!=a[j--])
                return false;
        }
        return true;
    }
}
