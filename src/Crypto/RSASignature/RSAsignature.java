package Crypto.RSASignature;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RSAsignature {

    static List<Integer> d=new ArrayList<>();
    static List<Integer> e=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pF = false;
        boolean qF = false;
        boolean FF = false;
        int p = 0, q = 0;

        while (!FF) {
            while (!pF) {
                System.out.print("Enter Value of P:");
                p = sc.nextInt();
                pF = isPrime(p);
                if (!pF)
                    System.out.println("Enter Prime Number");
            }
            System.out.println();
            while (!qF) {
                System.out.print("Enter Value of Q:");
                q = sc.nextInt();
                qF = isPrime(q);
                if (!qF)
                    System.out.println("Enter Prime Number");
            }

            if (p == q) {
                System.out.println("Both p and q are equal..Enter diffent value");
                qF = false;
                pF = false;
            } else {
                FF = true;
            }
        }

        System.out.println("p=" + p + "q=" + q);


        int n = p * q;
        int pn = (p - 1) * (q - 1);
        for (int i = 2; i <= pn; i++) {
            if (gcd(i, pn) == 1) {
                e.add(i);
            }
        }
        System.out.println("pi(n)="+pn);


        boolean newFlag = false;

        int k = 0;
        while (!newFlag) {
            System.out.println("Choose Your Key=");
            System.out.println(e);
            k = sc.nextInt();
            if (e.contains(k)) {
                newFlag = true;
            }
        }
        int dekey =0;

        boolean aa=false;
        while (!aa){
            if((k*dekey)%pn==1){
                aa=true;
            }
            else dekey+=1;
        }


        System.out.println("e="+k+"  d="+dekey);

        System.out.print("Enter the Value of Message=");
        double m = sc.nextInt();

        long sig = (long) (Math.pow(m,dekey))%n;
        long sig1 = (long) (Math.pow(sig,k))%n;
        System.out.println("Signature:"+sig);
        System.out.println("Signature Inverse:"+sig1);


        // Encryption c = (msg ^ e) % n
        long c = (long) (Math.pow(m,k))%n;
        System.out.println("Encyption="+c);


        // Decryption m = (c ^ d) % n
        BigInteger answer = BigInteger.valueOf(c).pow(dekey);
        BigInteger nn=BigInteger.valueOf(n);
        BigInteger ans=answer.mod(nn);
        System.out.println("Decyption="+ans);
        int aa1= (int) sig1;
        if(sig1==m){
            System.out.println("Verified");
        }



    }


    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }


    public static int gcd(int a, int h)
    {
        int temp;
        while (true)
        {
            temp = a%h;
            if (temp == 0)
                return h;
            a = h;
            h = temp;
        }
    }
}
