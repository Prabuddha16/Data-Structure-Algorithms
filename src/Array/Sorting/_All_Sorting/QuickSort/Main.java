package Array.Sorting._All_Sorting.QuickSort;

public class Main {
    static void quickSort(int[] arr, int low, int high)
    {
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
