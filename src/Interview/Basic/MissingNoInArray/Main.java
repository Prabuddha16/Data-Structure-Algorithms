package Interview.Basic.MissingNoInArray;

public class Main {
    static int MissingNumber(int[] array, int n) {
        int i, total;
        total = (n + 1) * (n) / 2;
        for (i = 0; i < n; i++)
            total -= array[i];
        return total;
    }

    public static void main(String[] args) {
        int[] a = {9,6,4,2,3,5,7,0,1};
        int n = a.length;
        int ans = MissingNumber(a,n);
        System.out.println(ans);
    }
}
