package Crypto.HellmanKey;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DiffieHellman {

    static ArrayList<Integer> primitiveRootList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter large prime number:-");
        int q=sc.nextInt();
        primtiveRootTable(q);
        System.out.println("Select any primitive root of q:-");
        int alpha=sc.nextInt();
        System.out.println("Enter Xa private key less than q:-");
        int xa=sc.nextInt();
        System.out.println("Enter Xb private key less than q:-");
        int xb=sc.nextInt();
        BigInteger a = null,b = null;
        if(xa < q || xb < q){
            BigInteger ya=powerC1(alpha,xa,q);
            BigInteger yb=powerC1(alpha,xb,q);
            System.out.println("Ya="+ya);
            System.out.println("Yb="+yb);
            int ya1=ya.intValue();
            int yb1=yb.intValue();
            BigInteger k1=powerC(yb1,xa,q);
            BigInteger k2=powerC(ya1,xb,q);
            a = k1;
            b = k2;
            System.out.println("K1="+k1);
            System.out.println("K2="+k2);
        }else{
            System.out.println("Wrong Input");
        }
        
        if(a.intValue()==b.intValue()){
            System.out.println("Key Exchange Sucessfull");
        }
        else
            System.out.println("No Key Exchange K1 != K2");

    }

    static void primtiveRootTable(int n){
        int phi=calculatePhi(n);
        int [][] matrix=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int calc=power(i,j,n);
                matrix[i][j]=calc;
            }
        }
        HashMap<Integer,Integer> orderOfElement=new HashMap<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i][j]==1){
                    orderOfElement.put(i,j);
                    break;
                }
            }
        }
        for(Integer ele:orderOfElement.keySet()){

            if(orderOfElement.get(ele)==phi){
                primitiveRootList.add(ele);
            }
        }
        System.out.println(primitiveRootList);
    }

    private static int calculatePhi(int n){
        if(isPrime(n)) return n-1;
        List<Integer> listofPrime=new ArrayList<>();
        findPrimefactors(listofPrime,n);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:listofPrime){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int pro=1;
        for(int i:map.keySet()){
            if(map.get(i)>1){
                int calc=(int)Math.abs(Math.pow(i,map.get(i))-Math.pow(i,map.get(i)-1));
                pro*=calc;
            }
            else{
                pro*=(i-1);
            }
        }
        return pro;
    }

    static void findPrimefactors(List<Integer> s, int n)
    {
        while (n % 2 == 0)
        {
            s.add(2);
            n = n / 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i = i + 2)
        {
            while (n % i == 0)
            {
                s.add(i);
                n = n / i;
            }
        }
        if (n > 2)
        {
            s.add(n);
        }
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        if (n <= 3)
        {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }

        return true;
    }

    static int power(int x, int y, int p)
    {
        int res = 1;

        x = x % p;
        if (x == 0)
            return 0;

        while (y > 0)
        {
            if ((y & 1) != 0)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }


    private static BigInteger powerC1(long c, long b, long p)
    {
        BigInteger answer = BigInteger.valueOf(c).pow((int) b);
        BigInteger nn=BigInteger.valueOf(p);
        BigInteger ans=answer.mod(nn);
        return ans;
    }

    private static BigInteger powerC(long c, long b, long p)
    {
        BigInteger answer = BigInteger.valueOf(c).pow((int) b);
        BigInteger nn=BigInteger.valueOf(p);
        BigInteger ans=answer.mod(nn);
        return ans;
    }
}