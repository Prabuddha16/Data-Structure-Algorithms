package Backtracking_Recursion.Backtracking.PrintParenthesis;

/*
	Time complexity: O(4 ^ N / sqrt(N))
	Space complexity: O(4 ^ N / sqrt(N))

	where N is the given number

 */

public class Solution
{
    private static void printParenthesesHelper(String cur, int open, int close, int max)
    {
        if (cur.length() == max * 2)
        {
            System.out.println(cur);
            return;
        }

        if (open < max)
        {
            printParenthesesHelper(cur + "{", open + 1, close, max);
        }
        if (close < open)
        {
            printParenthesesHelper(cur + "}", open, close + 1, max);
        }
    }

    public static void printParentheses(int n)
    {
        printParenthesesHelper("", 0, 0, n);
        return;
    }
}