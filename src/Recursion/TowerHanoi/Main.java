package Recursion.TowerHanoi;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = hanoi("T1", "T2", "T3", n);
        System.out.println(res);
    }

    public static int hanoi(String s, String d, String h, int n) {
        if(n == 1){
            System.out.println("Move "+ n+"th "+"disc from "+s+" to "+d);
            return 1;
        }

        int c = 0;

        c += hanoi(s, h, d, n-1);

        System.out.println("Move "+ n+"th "+"disc from "+s+" to "+d);
        c += 1;

        c += hanoi(h, d, s, n-1);

        return c;

    }
}
