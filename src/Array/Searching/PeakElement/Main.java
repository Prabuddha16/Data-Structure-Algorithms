package Array.Searching.PeakElement;

public class Main {
    public int peakElement(int[] arr,int n)
    {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end -start) /2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
