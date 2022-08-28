package Interview.String.RemoveDuplicaCharacters;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String s = "programming";

        StringBuilder sbe = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(Character ch : set){
            sbe.append(ch);
        }
        System.out.println(sbe);


        StringBuilder sb = new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);


        StringBuilder sbr = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = s.indexOf(ch,i+1);
            if(idx==-1){
                sbr.append(ch);
            }
        }
        System.out.println(sbr);


        char[] arr = s.toCharArray();
        StringBuilder sbd = new StringBuilder();
        for(int i=0;i< arr.length;i++){
            boolean repeat = false;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                sbd.append(arr[i]);
            }
        }
    }
}
