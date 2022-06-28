package Backtracking_Recursion.Backtracking.PhoneLetter;

/*
	Time Complexity: O(3^N * 4^M)
	Space Complexity: O(3^N * 4^M)

	where 'N' is the number of digits in the string 'S' that maps to 3 letters and 'M' is the number of digits in the string 'S' that maps to 4 letters
*/

import java.util.ArrayList;

public class Solution
{
    public static void combinationsHelper(String digits, String[] digToStr, int j, String temp, ArrayList<String> ans)
    {
        if(j == digits.length()){
            ans.add(temp);
            return;
        }
        int val = digits.charAt(j) - '0';
        for(int i = 0 ; i < digToStr[val].length() ; i++)
        {
            temp += digToStr[val].charAt(i);
            combinationsHelper(digits,digToStr,j+1,temp,ans);
            temp = temp.substring(0, temp.length() - 1);
        }
    }

    public static ArrayList<String> combinations(String s)
    {
        String[] digToStr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int n =  s.length();
        String temp = new String();
        ArrayList<String> ans = new ArrayList<>();
        if(n == 0)
        {
            return ans;
        }
        combinationsHelper(s,digToStr,0,temp,ans);
        return ans;
    }
}
