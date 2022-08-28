package Interview.BasicRecursion.ArraySortedOrNot;

public class Main {
    //iterative approach
    public static boolean arraySortedOrNot(int []arr, int n){
        if(n==0 || n== 1)  //Array is having either one or no element
            return true;

        for(int i=1; i<n; i++){
            if(arr[i-1] > arr[i]) // Any unsorted pair found
                return false;
        }
        return true; // No unsorted pair found
    }

    //recursive
    static boolean arraySortedorNot(int[] a, int n)
    {
        if (n == 1 || n == 0)
            return true;
        return a[n - 1] >= a[n - 2] && arraySortedorNot(a, n - 1);
    }
}
