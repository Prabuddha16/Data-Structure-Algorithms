package SlidingWindow.String.LongestSubstringWithoutRepeat;

// Longest Substring Without Repeating Characters

import java.util.HashMap;

public class Main {
    int longestUniqueSubsttr(String S){
        HashMap<Character,Integer> mp = new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(mp.containsKey(c)){
                l = Math.max(l,mp.get(c)+1);
            }
            mp.put(c,i);
            max = Math.max(max,(i-l+1));
        }
        return max;
    }
}

/*
Time Complexity: O(n + d) where n is length of the input string and d is number of characters in input string alphabet.
For example, if string consists of lowercase English characters then value of d is 26.
Auxiliary Space: O(d)

 */
