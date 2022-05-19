package String.UpperCaseInString;

//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String str = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.transform(str));
        }
    }
}
class Solution
{
    public String transform(String s)
    {
        char [] str = s.toCharArray();

        str[0] = Character.toUpperCase(str[0]);

        for(int i=0;i<s.length()-1;i++){
            if(str[i] == ' '){
                str[i+1] = Character.toUpperCase(str[i+1]);
            }
        }
        return String.valueOf(str);
    }
}
