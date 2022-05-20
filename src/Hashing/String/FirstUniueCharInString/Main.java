package Hashing.String.FirstUniueCharInString;

//find the first non-repeating character in it and return its index. If it does not exist, return -1.

import java.util.HashMap;

class Main {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hp = new HashMap<>();
        for(int i=0; i<s.length(); i++) {

            if(hp.containsKey(s.charAt(i)))
                hp.put(s.charAt(i), hp.get(s.charAt(i))+1);
            else
                hp.put(s.charAt(i), 1);
        }

        //check freq
        for(int i=0; i<s.length(); i++) {

            if(hp.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "hackcodehack";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
}
