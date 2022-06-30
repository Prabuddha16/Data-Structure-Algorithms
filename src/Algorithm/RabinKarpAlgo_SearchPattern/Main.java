package Algorithm.RabinKarpAlgo_SearchPattern;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<S.length()-pat.length()+1;i++)
        {
            if(S.substring(i,i+pat.length()).compareTo(pat)==0)
            {
                lst.add(i+1);
            }
        }
        if(lst.size()==0)
        {
            lst.add(-1);
            return lst;
        }
        else
            return lst;
    }
}
