package Interview.BasicRecursion.Factorial;

public class Main {
    static long factorial(int N){
        if(N == 0)
            return 1;
        return N*factorial(N-1);
    }
}
