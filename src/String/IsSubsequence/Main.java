package String.IsSubsequence;

public class Main {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();
        while(i<n && j<m){
            if(t.charAt(j++) == s.charAt(i))
                i++;
        }
        return i==n;
    }
}
