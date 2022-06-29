package DP.Array.MaxTipCalculator;

class Main
{
    static int maximumTip(int []arr1,int []arr2, int n, int x, int y)
    {
        if (n == 0)
            return 0;

        if (x != 0 && y != 0)
            return Math.max(arr1[n - 1] + maximumTip(arr1, arr2, n - 1, x - 1, y),
                            arr2[n - 1] + maximumTip(arr1, arr2, n - 1, x, y - 1));

        if (y == 0)
            return arr1[n - 1] + maximumTip(arr1, arr2, n - 1, x - 1, y);
        else
            return arr2[n - 1] + maximumTip(arr1, arr2, n - 1, x, y - 1);
    }

    public static void main (String[] args) {
        int N = 5;
        int X = 3;
        int Y = 3;

        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = { 5, 4, 3, 2, 1 };

        System.out.println(maximumTip(A, B, N, X, Y));
    }
}

