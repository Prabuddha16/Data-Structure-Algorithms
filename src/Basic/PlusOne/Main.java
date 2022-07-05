package Basic.PlusOne;

import java.util.ArrayList;

public class Main {
    public int[] plusOne(int[] s) {
        int n = s.length;
        for(int i=n-1;i>=0;i--){
            if(s[i]<9){
                s[i]++;
                return s;
            }
            s[i]=0;
        }
        int[] arr = new int[n+1];
        arr[0]=1;
        return arr;
    }

    static ArrayList<Integer> increment(ArrayList<Integer> al , int n) {
        int carry = 1;
        int len = n - 1;
        for(int i = 0; i < n; i++){
            al.set(len - i, al.get(len - i) + carry);
            if(al.get(len - i) > 9){
                carry = al.get(len - i) / 10;
                al.set(len - i,0);
            }
            else{
                carry = 0;
            }
        }
        if(carry > 0){
            al.add(0,carry);
        }
        return al;
    }
}
