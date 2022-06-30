package Algorithm.KMP_Algo_Search_Pattern;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int n = txt.length();
        int k = pat.length();

        for(int i = 0;i<n-k+1;i++){
            int flag = 1;
            if(txt.charAt(i)!=pat.charAt(0))
                continue;
            for(int j = i;j<(i+k);j++){
                if(txt.charAt(j)!=pat.charAt(j-i)){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                res.add(i+1);
            }
        }
        return res;
    }
}
