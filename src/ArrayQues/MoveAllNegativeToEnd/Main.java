package ArrayQues.MoveAllNegativeToEnd;

public class Main {
    public static void segregateElements(int arr[], int n)
    {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        if (j == n || j == 0)
            return;

        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] a = {1,-2,-3,5,-7,3,6,-5,4};
        int n = a.length;
        segregateElements(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
