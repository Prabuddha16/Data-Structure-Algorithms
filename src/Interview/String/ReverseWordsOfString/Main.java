package Interview.String.ReverseWordsOfString;

public class Main {
    String reverseWords(String S)
    {
        String[] words = null;
        words=S.split("\\.");
        int n=words.length-1;
        String ans=words[n];
        n--;
        while(n>=0){
            ans=ans+"."+words[n];
            n--;
        }
        return ans;
    }
}
