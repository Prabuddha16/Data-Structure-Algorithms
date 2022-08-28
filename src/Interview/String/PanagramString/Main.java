package Interview.String.PanagramString;

public class Main {
    public boolean checkIfPangram(String str) {
        int []CHAR=new int[26];
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                CHAR[str.charAt(i)-'a']++;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                CHAR[str.charAt(i)-'A']++;
        }
        for(int i=0; i<26; i++)
        {
            if(CHAR[i]==0)
                return false;
        }
        return true;
    }
}
