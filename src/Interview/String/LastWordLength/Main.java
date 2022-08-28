package Interview.String.LastWordLength;

public class Main {
    public static int lengthOfLastWord(String s) {
        int size=0;
        String[] a = s.split(" ");
        size = a[a.length-1].length();
        return size;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int size = lengthOfLastWord(s);
        System.out.println(size);
    }
}
