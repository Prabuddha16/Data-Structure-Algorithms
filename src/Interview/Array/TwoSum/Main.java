package Interview.Array.TwoSum;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int k = 9;
        int[] ans = sum(arr,k);
        for(int i=0;i< ans.length;i++)
            System.out.print(ans[i]+" ");
    }

    static int[] sum(int[] arr, int key){
        int[] a = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(key-arr[i])){
                a[0]=i;
                a[1]=map.get(key-arr[i]);
                return a;
            }else{
                map.put(arr[i],i);
            }
        }
        return a;
    }
}
