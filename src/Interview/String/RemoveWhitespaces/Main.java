package Interview.String.RemoveWhitespaces;

public class Main {
    public static void main(String[] args) {
        String s = " j a va s ta r ";

        String ans = s.replaceAll("[^a-zA-Z0-9]","");

        String res = s.trim();   //it removes spaces from front and end

        String sol = s.replaceAll("\\s","");

        System.out.println(ans);
        System.out.println(res);
        System.out.println(sol);
    }
}
