package Interview.String.AnagramString;

import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
            return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }

    public static boolean anagram(String s,String t){
        int[] c = new int[256];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
            c[t.charAt(i)]--;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
        System.out.println(anagram("baa","aab"));
    }
}
