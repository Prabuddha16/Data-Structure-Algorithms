package Interview.Basic.ValueEqualIndex;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int m=i+1;
            if(m==arr[i])
            {
                a.add(m);
            }
        }
        return a;
    }
}
