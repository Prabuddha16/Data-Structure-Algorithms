package Backtracking_Recursion.Backtracking.PermutationsWithSpaces;

import java.util.ArrayList;

public class Main {
    ArrayList<String> permutation(String S){
        ArrayList<String> ans = new ArrayList<>();
        if(S.length()==0){
            ans.add("");
            return ans;
        }

        char ch = S.charAt(0);
        ArrayList<String> res = permutation(S.substring(1));
        for(String s : res){
            if(!s.isEmpty())
                ans.add(ch+" "+s);
        }
        for(String s : res){
            ans.add(ch+s);
        }
        return ans;
    }
}
