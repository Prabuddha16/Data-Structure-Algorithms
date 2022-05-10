package String.StringToInteger;

import java.util.Scanner;
public class Main {
    public static int strToInt(String s){
        if (s.length() == 1)
            return (s.charAt(0) - '0');
        double y = strToInt(s.substring(1));
        double x = s.charAt(0) - '0';
        x = x * Math.pow(10, s.length() - 1) + y;
        return (int)(x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(strToInt(s));
    }
}

