package RegularExpressions.RegExMatching;

public class Main {
    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j >= 0; j--){
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}

class Solution {
    static int isPatternPresent(String S, String P) {

        int n=S.length();
        int m=P.length();

        int flag = 1;

        if(P.charAt(0)=='^')
        {
            if(m>(n+1))
                flag=0;
            for(int i=1 ; i<m ;i++)
            {
                if(S.charAt(i-1)!=P.charAt(i))
                    flag=0;
            }
        }
        else if(P.charAt(m-1)=='$')
        {
            if(m>(n+1))
                flag=0;
            int x=n-(m-1);
            for(int i=0 ; i<m-1 ;i++)
            {
                if(S.charAt(x+i)!=P.charAt(i))
                    flag=0;
            }
        }
        else
        {
            flag=0;
            for(int i=0; i<=n-m ; i++)
            {
                String check="";
                for(int j=0 ; j<m ;j++)
                    check+=S.charAt(i+j);
                if(check.equals(P))
                    flag=1;
            }
        }

        if(flag==1)
            return 1;
        else
            return 0;
    }
};

