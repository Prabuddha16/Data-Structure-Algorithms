package String.CountVowels;

import java.util.Scanner;

public class Main {
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    static boolean checkVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i)))
                ++count;
        if(count%2==0)
            return false;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(checkVowels(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

