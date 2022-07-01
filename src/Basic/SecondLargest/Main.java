package Basic.SecondLargest;

public class Main {
    int print2largest(int[] arr, int n) {
        int f=-1,s=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }else if(arr[i]>s && arr[i]!=f){
                s=arr[i];
            }
        }
        return s;
    }
}
