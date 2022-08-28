package Interview.Mathematics.PowerOfNos;

import java.util.*;
class Main {
    public static long rev(long n)
    {
        long rev_num = 0;
        while(n > 0)
        {
            rev_num = rev_num*10 + n%10;
            n = n/10;
        }
        return rev_num;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            Solution obj=new Solution();
            int N;
            N=sc.nextInt();
            int R=0;
            R=(int)rev(N);
            long ans=(long)obj.power(N,R);
            System.out.println(ans);
        }
    }
}

class Solution
{
    //t=logn s=logn
    long power(int N,int R)
    {
        int m = 1000000007;
        long temp;
        if( R == 0)
            return 1;
        temp = power(N, R / 2);
        if (R % 2 == 0)
            return temp%m*temp%m;
        else
            return N*temp%m*temp%m;
    }
}

