package Backtracking_Recursion.Backtracking.StringSubsequences;

import java.util.ArrayList;

/*
	Time Complexity: O(2^N)
	Space Complexity: O(N^2)

	Where 'N' is the number of letters in the string 'STR'
*/

class Solution
{
    public static void subsequencesHelper(String s, int index, String temp, ArrayList<String> ans)
    {
        if(index == s.length())
        {
            if(temp.length() != 0)
            {
                ans.add(temp);
            }
            return;
        }
        subsequencesHelper(s, index + 1, temp, ans);
        temp += s.charAt(index);
        subsequencesHelper(s, index + 1, temp, ans);
    }

    public static ArrayList<String> subsequences(String str)
    {
        int n = str.length();
        ArrayList<String> ans = new ArrayList<>();
        String temp = "";
        subsequencesHelper(str, 0, temp, ans);
        return ans;
    }
}
