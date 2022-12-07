package Crypto.Euclid_gcd;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a=");
        int a=sc.nextInt();
        System.out.print("Enter b=");
        int b=sc.nextInt();
        int r1=a;
        int r2=b;
        int r=0;
        int q=0;
        while (r2>0){
            q=r1/r2;
            r=r1-(q*r2);
            System.out.print("q="+q+"  r1="+r1+"  r2="+r2+"  r="+r);
            System.out.println();
            r1=r2;
            r2=r;
        }
        System.out.print("     r1="+r1+"  r2="+r2);
        System.out.println();
        System.out.println("GCD="+r1);

    }
}