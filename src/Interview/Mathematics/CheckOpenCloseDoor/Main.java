package Interview.Mathematics.CheckOpenCloseDoor;

public class Main {
    static int[] checkDoorStatus(int N) {
        int[] arr = new int [N];

        int i = 1;

        while(i*i <= N){
            arr[(i*i) - 1] = 1;
            i++;
        }

        return arr;
    }
}
