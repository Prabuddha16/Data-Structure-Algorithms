package Interview.Mathematics.IsPalindrome;

public class Main {
    public boolean isPalindrome(int x) {
        int n=x;
        int revNum = 0;
        while(n>0) {
            revNum = (revNum*10) + (n%10);
            n = n/10;
        }
        return revNum==x;
    }
}

//why cannot reverse the no.
//19999->99991 can cause overflow

