package Interview.String.RemoveSpecialCharacters;

public class Main {
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";

        String ans = str.replaceAll("[^a-zA-z0-9]","");
        System.out.println(ans);
    }
}
