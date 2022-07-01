package Searching.Triangle.PossibleTriangle;

import java.util.Arrays;

class Main {
    static boolean isPossibleTriangle(int[] arr, int N)
    {
        if (N < 3)
            return false;
        Arrays.sort(arr);
        for (int i = 0; i < N - 2; i++)
            if (arr[i] + arr[i + 1] > arr[i + 2])
                return true;
        return false;
    }

    static public void main(String[] args)
    {
        int[] arr = { 5, 4, 3, 1, 2 };
        int N = arr.length;
        if (isPossibleTriangle(arr, N))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//o(nlogn)
//o(logn)

