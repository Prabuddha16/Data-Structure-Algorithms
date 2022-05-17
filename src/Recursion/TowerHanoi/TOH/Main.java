package Recursion.TowerHanoi.TOH;


import java.util.Scanner;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;

            N = sc.nextInt();

            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}


class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        long count = 0;
        if(N == 0){
            return 0;
        }

        count += toh(N-1, from, aux, to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        count += toh(N-1, aux, to, from);

        return ++count;
    }
}

