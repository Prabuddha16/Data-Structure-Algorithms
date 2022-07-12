package Basic.AllPrimeTillN;


    import java.util.*;

    public class Main{

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int low = scn.nextInt();
            int high = scn.nextInt();
            if(low == 0 || low == 1) {
                low = 2;
            }
            for(int num = low; num <= high; num++){
                int div = 2;
                while(div * div <= num){
                    if(num % div == 0){
                        break;
                    }
                    div++;
                }
                if(div * div > num){
                    System.out.print(num+" ");
                }
            }
        }
    }


