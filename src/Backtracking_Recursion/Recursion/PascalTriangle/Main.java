package Backtracking_Recursion.Recursion.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        if(n==1)
        {
            ArrayList<Long> v = new ArrayList<>();
            v.add(1l);
            return v;
        }
        final long MOD = 1000_000_007;

        ArrayList<Long> v = new ArrayList<>();
        ArrayList<Long> tans = nthRowOfPascalTriangle(n-1);
        v.add(1l);
        long c = 1;
        for (int i = 1; i < n-1; i++) {
            v.add((tans.get(i)+tans.get(i-1))%MOD);
            //c = ((c % MOD * (n - i)) % MOD * mod.get(i)) % MOD;
        }
        v.add(1l);
        return v;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowList = new ArrayList<List<Integer>>();
        for(int i=0; i < numRows; i++){
            int elementsInRow=i+1;
            List<Integer> row = new ArrayList<Integer>();
            if(i==0)
                row.add(1);
            else{
                List prevRow = rowList.get(i-1);
                for(int j=0;j<elementsInRow;j++){
                    if(j==0 || j==elementsInRow-1)
                        row.add(1);
                    else
                        row.add(new Integer((int)prevRow.get(j) + (int)prevRow.get(j-1)));
                }
            }
            rowList.add(row);
        }
        return rowList;
    }
}
