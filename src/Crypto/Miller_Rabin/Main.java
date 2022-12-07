package Crypto.Miller_Rabin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=sc.nextInt();

        System.out.print("Enter the base a=");
        double a=sc.nextInt();

        double k=0,m=0;
        int p=n-1;
        while (p%2==0){
            k=k+1;
            p=p/2;
        }
        m=p;
        boolean f = false;
        System.out.println("k="+k+"    m="+m);
        double b=Math.pow(a,m)%n;
        if(b==1){
            System.out.println("Prime");
        }
        else {
            for (int i = 0; i < k; i++) {
                System.out.println("i="+i);
                b=(b*b)%n;

                if(b==n-1) {
                    System.out.println("N is prime");
                    f=true;
                    break;
                }

                else if(b==1){
                    System.out.println("N is composite");
                    f=true;
                    break;
                }

            }
            if(!f){
                System.out.println("N is composite");
            }
        }
    }
}