package Array.Sorting._All_Sorting.InsertionSort;

public class Main {
    static void insert(int[] arr, int i)
    {
        for(int j=0;j<i;j++){
            if(arr[i]<arr[j]){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
    }

    public void insertionSort(int[] arr, int n)
    {
        for(int i=1;i<n;i++){
            insert(arr,i);
        }
    }
}
