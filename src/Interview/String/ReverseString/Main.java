package Interview.String.ReverseString;

public class Main {
    //p1
    public static String reverseWordI(String str){
        StringBuilder sb=new StringBuilder(str);
        //StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }

    //p2
    public static String reverseWord(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
