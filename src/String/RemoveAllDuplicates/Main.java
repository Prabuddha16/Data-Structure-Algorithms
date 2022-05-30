package String.RemoveAllDuplicates;

public class Main {
    String removeDuplicates(String S) {
        String ans="";
        for(int i=0;i<S.length();i++){
            if(!ans.contains(S.substring(i,i+1))){
                ans=ans+S.substring(i,i+1);
            }
        }
        return ans;
    }
}
