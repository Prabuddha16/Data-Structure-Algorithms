package Interview.Basic.SecondSmallest;

public class Main {
    public static int solve(int[] arr){
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            if(arr[i]>small && arr[i]<secsmall){
                secsmall=arr[i];
            }
        }
        return secsmall;
    }
}
