package Backtracking_Recursion.Recursion.Replace_PI;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-->0) {
            String in = scan.nextLine();
            System.out.println(replace(in, 0, ""));
        }

    }

    public static String replace(String in, int i, String out) {
        if(Objects.equals(in, ""))
            return out;
        if(i == in.length()-1)
            return out+in.charAt(i);

        if(in.charAt(i) == 'p' && in.charAt(i+1) == 'i')
            return replace(in, i+2, out+"3.14");
        return replace(in, i+1, out+in.charAt(i));
    }
}