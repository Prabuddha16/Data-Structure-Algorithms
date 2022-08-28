package Interview.Mathematics.Factorial;

public class Solution {
    static long factorial(int N){
        if(N == 0)
            return 1;
        return N*factorial(N-1);
    }
}
