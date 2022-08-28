package Array.PosiNega_No.PositiveNegativeArrange;

import java.util.ArrayList;

public class Main {
    //Method-1
    /*
    Rearrange the given array in-place such that all the negative numbers occur before positive numbers.
    (Maintain the order of all -ve and +ve numbers as given in the original array).
     */
    public static void Rearrange(int[] a, int n)
    {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]<0){
                al.add(a[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                al.add(a[i]);
            }
        }
        for(int i=0;i<n;i++){
            a[i]=al.get(i);
        }
    }

    //Order is not important
    //Method-2
    /*Move all -ve to begin & +ve to end with constant space */
    //Partition process of quicksort
    static void rearrange(int[] arr, int n){
        int j=0, temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }

    //Method-3
    //Two Pointers Approach
    static void solve(int[] arr,int n){
        int l=0, r=n-1;
        while(l<=r){
            if(arr[l]<0 && arr[r]<0)
                l++;
            else if(arr[l]>0 && arr[r]<0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }else if(arr[l]>0 && arr[r]>0){
                r--;
            }else{
                l++;
                r--;
            }
        }
    }

    //Method-4
    //Order is important
    //Merge Sort
    static void merge(int[] a,int l,int m,int r){
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(i=0;i<n1;i++) {
            L[i] = a[l + i];
        }
        for(j=0;j<n2;j++) {
            R[i] = a[m + 1 + j];
        }
        i=0; j=0; k=l;
        while (i<n1 && L[i]<0){
            a[k++]=L[i++];
        }
        while (j<n2 && R[j]<0){
            a[k++]=R[j++];
        }
        while (i<n1){
            a[k++] = L[i++];
        }
        while (j<n2){
            a[k++] = R[j++];
        }
    }

    static void sort(int[] a, int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }

    //Drive Code
    public static void main(String[] args){
        int[] arr = {-3, -7, 4, 11, 6, 2, -9};
        int n = arr.length;
        Rearrange(arr,n);
        rearrange(arr,n);
        solve(arr,n);
        sort(arr,0,n-1);
    }
}
