package Array.Searching.Triangle.ValidTriangle;

import java.util.Arrays;
//o(nlogn) o(1)
public class Main {
    public int triangleNumber(int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for(int i = ar.length-1;i>1; i-- ){
            int l =0, h = i-1;
            while(l<h){
                if(ar[l]+ar[h]>ar[i]){
                    count+=h - l;
                    h--;
                }else{
                    l++;
                }
            }
        }
        return count;
    }
}
