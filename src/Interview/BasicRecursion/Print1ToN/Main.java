package Interview.BasicRecursion.Print1ToN;

public class Main {
    public static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }


    public static void main(String[] args) {
        int n = 100;
        printNos(n);
    }
}
