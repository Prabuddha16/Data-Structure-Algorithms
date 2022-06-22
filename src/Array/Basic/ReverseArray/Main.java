package Array.Basic.ReverseArray;

public class Main {
    //m-1
    void revArr(int a[], int start, int end){
        int temp;
        while (start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    //m-2
    void revArray(int[] a, int s, int e){
        int t;
        if(s>=e)
            return;
        t=a[s];
        a[s]=a[e];
        a[e]=t;
        revArray(a,s+1,e+1);
    }
}
