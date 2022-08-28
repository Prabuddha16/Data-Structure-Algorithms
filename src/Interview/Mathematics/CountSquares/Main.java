package Interview.Mathematics.CountSquares;

//t=sqrt(n) s=1

public class Main {
    static int countSquares(int N) {
        int i=1;
        int count=0;
        while(i*i< N){
            count++;
            i++;
        }
        return count;
    }
}
