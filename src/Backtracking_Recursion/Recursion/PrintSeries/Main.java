package Backtracking_Recursion.Recursion.PrintSeries;
//Print Pattern GFG
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
	Time Complexity  : O(N)
	Space Complexity : O(N)
	Where N is the given number.
*/
        public static List<Integer> printSeries(int n, int k) {
            List<Integer> answer = new ArrayList<>();
            series(n, k, answer);
            return answer;
        }

        private static void series(int n, int k, List<Integer> answer) {
            answer.add(n);
            if (n <= 0) {
                return;
            }
            series(n - k, k, answer);
            answer.add(n);
        }
}

