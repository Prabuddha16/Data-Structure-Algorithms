package String.LongestSubstringWithoutRepeatingChars;


import java.util.HashMap;

public class Main {
    public static void solve(String s){
        String longsubstr = null;
        int lenlongsubstr = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i=0;i< arr.length;i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else {
                i = map.get(ch);
                map.clear();
            }
            if(map.size() > lenlongsubstr){
                lenlongsubstr = map.size();
                longsubstr = map.keySet().toString();
            }
        }
        System.out.println(longsubstr);
        System.out.println(lenlongsubstr);
    }
    public static void main(String[] args) {
        solve("abbac");
    }
}
