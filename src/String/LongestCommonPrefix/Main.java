package String.LongestCommonPrefix;

import java.util.Arrays;

public class Main {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last= strs[strs.length-1];
        int c=0;
        while(c<first.length() && first.charAt(c)==last.charAt(c)){
            c++;
        }
        return c==0 ? "": first.substring(0,c);         //"-1" according to ques.
    }
}
