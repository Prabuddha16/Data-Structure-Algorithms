package DP.Basic.PascalTriangleNthRow;

import java.util.ArrayList;
import java.util.List;
//o(n)/o(1)
public class Main {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>(rowIndex+1);
        list.add(1);

        for (int i = 1; i < rowIndex+1; i++) {
            list.add( (int)(
                    (list.get(list.size()-1) * (long)(rowIndex - i + 1)) / i));
        }
        return list;
    }

    public List<Integer> solve(int N) {
        List<Integer> ans = new ArrayList();
        int prev = 1;
        ans.add(prev);

        for(int i = 1; i <= N; i++){
            // nCr = (nCr-1 * (n - r + 1))/r
            int curr = (prev * (N - i + 1)) / i;
            ans.add(curr);
            prev = curr;
        }
        return ans;
    }
}

class Solution{
    // Print the N-th row of the Pascal's Triangle
    static void generateNthrow(int N)
    {
        // nC0 = 1
        int prev = 1;
        System.out.print(prev);

        for(int i = 1; i <= N; i++)
        {
            // nCr = (nCr-1 * (n - r + 1))/r
            int curr = (prev * (N - i + 1)) / i;
            System.out.print(", " + curr);
            prev = curr;
        }
    }

    public static void main (String[] args)
    {
        int N = 5;
        generateNthrow(N);
    }
}
