package Sorting._All_Sorting.SelectionSort;

public class Main {
    int  select(int[] arr, int i)
    {
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }

    void selectionSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++){
            int min=select(arr,i);
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
