package Interview.Mathematics.Replace0sWith5;

import java.util.Scanner;

class Convert_To_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Main().convertfive(N));
            T--;
        }
    }
}

class Main {
    int convertfiveRec(int num) {
        if (num == 0)
            return 0;
        int digit = num % 10;
        if (digit == 0)
            digit = 5;
        return convertfiveRec(num / 10) * 10 + digit;
    }
    int convertfive(int num) {
        if (num == 0)
            return 5;
        else
            return convertfiveRec(num);
    }
}
