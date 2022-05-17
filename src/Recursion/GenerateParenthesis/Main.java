package Recursion.GenerateParenthesis;

import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for (String sequence : sequences) {
                System.out.println(sequence);
            }
            t--;
        }
    }
}

class Solution {
    public List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        generateParenthesis("",n,0,0,ans);
        return ans;
    }
    public void generateParenthesis(String s, int n, int opening_count, int closing_count,List<String> ans)
    {
        if(closing_count == n){
            ans.add(s);
            return;
        }
        if(opening_count > closing_count)
            generateParenthesis(s + ')',n,opening_count,closing_count+1,ans);
        if(opening_count < n)
            generateParenthesis(s + '(',n,opening_count+1,closing_count,ans);
    }
}
