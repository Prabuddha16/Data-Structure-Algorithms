package String.AsciiSubsequences;

import java.util.*;
public class Main{
    public static void main(String[] aargs){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int res=sequence(str,"");
        System.out.println();
        System.out.println(res);
        sc.close();
    }

    public static int sequence(String s,String a){
        if(s.length()==0){
            System.out.print(a+" ");
            return 1;
        }
        int c=0;
        char ch=s.charAt(0);
        c +=sequence(s.substring(1),a);
        c +=sequence(s.substring(1),a+ch);
        c +=sequence(s.substring(1),a+(int)ch);
        return c;
    }
}
