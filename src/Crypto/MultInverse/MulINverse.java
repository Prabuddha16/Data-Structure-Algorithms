package Crypto.MultInverse;

import java.util.Scanner;

public class MulINverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a=sc.nextInt();
        System.out.println("Enter the value of B:");
        int b= sc.nextInt();
        int co=0;
        for (int i = 1; i <=b; i++) {
            if((a*i)%b==1){
                System.out.println("Inverse:"+i);
                co=1;
                break;
            }
        }
        if(co==0){
            System.out.println("Inverse Not Exists");
        }
    }
}
