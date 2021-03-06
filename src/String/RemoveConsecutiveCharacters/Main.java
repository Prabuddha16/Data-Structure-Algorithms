package String.RemoveConsecutiveCharacters;

public class Main {
    public static String reduced_String(int k, String s)
    {
        if (k==1)
            return "";
        StringBuilder output = new StringBuilder(s);
        int[] count = new int[output.length()];

        for(int i=0; i<output.length(); i++)
        {
            if( i==0 || output.charAt(i) != output.charAt(i-1) )
                count[i] = 1;
            else
            {
                count[i] = count[i-1] + 1;
                if(count[i]==k)
                {
                    output.delete(i-k+1,i+1);
                    i = i-k;
                }
            }
        }
        return output.toString();
    }
}
