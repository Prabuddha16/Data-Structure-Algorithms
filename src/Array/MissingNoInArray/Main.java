package Array.MissingNoInArray;

public class Main {
    static int MissingNumber(int[] array, int n) {
        int res = n * (n + 1) / 2;
        for(int i = 0; i < n - 1; i++) {
            res -= array[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,6,5};
        int n = a.length;
        int ans = MissingNumber(a,n);
        System.out.println(ans);
    }
}
