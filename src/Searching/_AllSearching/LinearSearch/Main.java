package Searching._AllSearching.LinearSearch;

//o(n)
//o(1)
public class Main {

    static int search(int[] arr, int N, int X)
    {
        for(int i=0; i<N; i++) {
            if(arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int x = 4;
        int res = search(a,n,x);
        System.out.println(res);
    }
}
