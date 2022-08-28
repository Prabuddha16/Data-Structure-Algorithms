package Interview.String.RemoveConsecutiveCharacters;

public class Main {
    String solve(String s){
        String str = "";
        int i=0;
        for(i=0;i<str.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1))
                str+=s.charAt(i);
        }
        str+=s.charAt(i);
        return str;
    }
}
