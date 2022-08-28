package Interview.String.ShortCharInAlphaOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "rock";
        System.out.println(sort(s));
    }
    static String sort(String s)
    {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    /*
    char[] arr = s.toCharArray();
    char temp;
    for(int i=0;i<arr.length;i++)
        for(int j=i+1;j<arr.length;j++)
            if(arr[i]>arr[j])
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
    sout(new String(arr));
     */
}
