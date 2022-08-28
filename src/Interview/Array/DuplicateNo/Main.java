package Interview.Array.DuplicateNo;

public class Main {
    //m-1
    int duplicate(int[] arr){
        int slow=0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        while (slow!=fast);
            slow=0;
        while (slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

    //m-2
    int duplica(int[] a){
        int len = a.length;
        for(int n : a){
            int idx = Math.abs(n);
            if(a[idx]<0){
                return idx;
            }
            a[idx]=-a[idx];
        }
        return len;
    }
}
