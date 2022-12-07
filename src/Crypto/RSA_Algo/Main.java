package Crypto.RSA_Algo;

import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st prime no. :");
        int p = sc.nextInt();

        System.out.println("Enter the 2nd prime no. :");
        int q = sc.nextInt();

        int n = p * q;
        System.out.println("The value of n :" + n);

        int z = (p - 1) * (q - 1);
        System.out.println("The value of z = " + z);

        int d = 0, e;
        System.out.println("Enter the message size :");
        int M = sc.nextInt();

        double c;
        BigInteger P;

        //Select e such that gcd = 1
        for (e = 2; e < z; e++) {
            if (gcd(e, z) == 1) {
                list.add(e);
            }
        }
        System.out.println(list);

        System.out.println("Enter your choice for e :");
        int v;
        while(true){
            v = sc.nextInt();
            if(list.contains(v)){
                break;
            }
            System.out.println("Enter correct choice for e :");
        }
        System.out.println("the value of e = " + v);

        for (int i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            if (x % v == 0) {
                d = x / v;
                break;
            }
        }
        System.out.println("the value of d = " + d);

        c = (Math.pow(M, v)) % n;
        System.out.println("Encrypted message is : " + c);

        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        P = (C.pow(d)).mod(N);
        System.out.println("Decrypted message is : " + P);
    }

    static int gcd(int e, int z)
    {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }
}

