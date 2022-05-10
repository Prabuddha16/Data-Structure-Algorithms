package String.RemoveDuplicates;

import java.util.Scanner;

public class Main {
    public static String  remove(String s){
        String ans = "";
        for (int i=0;i<s.length();i++){
            if(!ans.contains(s.substring(i,i+1))){
                ans=ans + s.substring(i,i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       System.out.println(remove(s));
    }
}

