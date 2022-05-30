package String.CheckStringRotations;

public class Main {
    public static boolean areRotations(String s1, String s2 )
    {
        return (s1.length()==s2.length()) && (s2+s2).contains(s1);
    }
}
