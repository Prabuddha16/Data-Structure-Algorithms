package Interview.Mathematics.SqRootNo;
//t=logn s=1
import java.util.Scanner;

class SquartRoot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
class Solution
{
    long floorSqrt(long a)
    {
        if (a == 0)
            return 0;
        if (a == 1)
            return 1;
        long l = 0;
        long h = a;
        long mid;
        while(l<=h){
            mid = (l+h)/2;
            if (mid == (a / mid))
                return mid;
            else if (mid < (a / mid))
                l = mid + 1;
            else
                h = mid - 1;
        }
        return (long) Math.floor(h);
    }
}

