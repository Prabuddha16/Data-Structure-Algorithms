package String.MoveAll_X_toEnd;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(xAtEnd(input, 0, "", ""));
    }

    public static String xAtEnd(String input, int i, String x, String y)
    {

        if(i == input.length())
            return x+y;

        if(input.charAt(i) == 'x')
            return xAtEnd(input, i+1, x, y+'x');
        else
            return xAtEnd(input, i+1, x+input.charAt(i), y);

    }
}
