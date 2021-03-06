package Sorting._All_Sorting.BubbleSort;

import java.util.*;
class Solution
{
    public static void bubbleSort(int[] arr, int n)
    {
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }}}}
}

/*
static void bubbleSort(int arr[], int n)
    {
        if (n == 1)  return;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubbleSort(arr, n-1);
    }
 */

class Sorting
{
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            new Solution().bubbleSort(arr,n);
            printArray(arr);
            t--;
        }
    }
}
