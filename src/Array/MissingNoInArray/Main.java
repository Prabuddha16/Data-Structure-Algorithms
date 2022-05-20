package Array.MissingNoInArray;

public class Main {
    static int MissingNumber(int[] array, int n) {
        int i, total;
        total = (n + 1) * (n) / 2;
        for (i = 0; i < n-1; i++)
            total -= array[i];
        return total;
    }

    public static void main(String[] args) {
        int[] a = {6,1,2,8,3,4,7,10,5};
        int n = a.length;
        int ans = MissingNumber(a,n);
        System.out.println(ans);
    }
}
