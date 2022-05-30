package Hashing.String.RomanToInteger;

import java.util.HashMap;

public class Main {
    public int romanToDecimal(String str) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        char arr[]=str.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(hm.get(arr[i])>=hm.get(arr[i+1])){
                sum+=hm.get(arr[i]);
            }else{
                sum-=hm.get(arr[i]);
            }
        }
        sum+=hm.get(arr[arr.length-1]);
        return sum;
    }
}
