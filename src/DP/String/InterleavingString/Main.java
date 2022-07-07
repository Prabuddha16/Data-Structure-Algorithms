package DP.String.InterleavingString;

import java.util.Scanner;

public class Main {
    public static boolean solution(String s1, String s2, String s3){
        boolean[][] dp = new boolean[s1.length()+1][s1.length()+1];
        for(int i=0 ; i<dp.length ; i++){
            for(int j=0 ; j<dp[0].length ; j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = s2.charAt(j-1) == s3.charAt(i+j-1) ? dp[i][j-1] : false;
                }else if(j==0){
                    dp[i][j] = s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j];
                }else{
                    if (s1.charAt(i - 1) == s3.charAt(i + j - 1)){
                        dp[i][j] = dp[i-1][j];
                    }
                    if(!dp[i][j] && s2.charAt(j-1) == s3.charAt(i+j-1)){
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static boolean recursive(String s1, String s2, String s3, int i ,int j){

        if(i==s1.length() && j==s2.length()){
            return true;
        }


        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            boolean f1 = recursive(s1,s2,s3,i+1,j);
            if(f1){                   //f1==true
                return true;
            }
        }

        if(j<s2.length() && s2.charAt(i)==s3.charAt(i+j)){
            boolean f2 = recursive(s1,s2,s3,i,j+1);
            if(f2){
                return true;
            }
        }
        return false;
    }

    public static boolean memoSolo(String s1, String s2, String s3, int i, int j, Boolean[][] dp){
        if(i==s1.length() && j==s2.length()){
            return true;
        }


        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            boolean f1 = memoSolo(s1,s2,s3,i+1,j,dp);
            dp[i][j] = f1;
            if(f1){                   //f1==true
                return true;
            }
        }

        if(j<s2.length() && s2.charAt(i)==s3.charAt(i+j)){
            boolean f2 = memoSolo(s1,s2,s3,i,j+1,dp);
            dp[i][j] = f2;
            if(f2){
                return true;
            }
        }
        dp[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if(s1.length()+s2.length() != s3.length()){
            System.out.println("false");
            return;
        }
        System.out.println(recursive(s1,s2,s3,0,0));
        System.out.println(memoSolo(s1,s2,s3,0,0,new Boolean[s1.length()][s2.length()]));
        System.out.println(solution(s1,s2,s3));
    }
}
