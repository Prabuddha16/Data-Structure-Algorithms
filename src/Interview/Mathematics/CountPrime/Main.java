package Interview.Mathematics.CountPrime;

public class Main {
    boolean isprime(int n){
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public void display(int k)
    {
        int count=0;
        for(int i=2;i<=k;i++){
            if(isprime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
