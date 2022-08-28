package Interview.String.OccurrenceOfEachCharacters;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(char ch : arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int value = map.get(ch);
                map.put(ch,value+1);
            }
        }
        System.out.println(map);
    }
}
