package String.Subsequences;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sol = reSeq(s,"");
        System.out.println();
        System.out.println(sol);
        sc.close();
    }
    public static int reSeq(String str , String a){
        if(str.length()==0){
            System.out.print(a+" ");
            return 1;
        }
        int c=0;
        char ch = str.charAt(0);
        c+=reSeq(str.substring(1),a);
        c+=reSeq(str.substring(1),a+ch);
        return c;
    }
}
