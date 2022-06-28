package String.PermutationOfString;
/*
Input: ABC
Output: ABC ACB BAC BCA CAB CBA
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void permutation(String str, String asf, List<String> ans)
    {
        if(str.length()==0)
        {
            ans.add(asf);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String ros = left+right;
            permutation(ros,asf+ch,ans);
        }
    }
    public List<String> find_permutation(String s) {
        List<String> ans = new ArrayList<>();
        permutation(s,"",ans);
        Collections.sort(ans);
        return ans;
    }
}
