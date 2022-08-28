package Interview.Basic.MinMaxInArray;

public class Main {
    class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    pair getMinMax(long[] a, long n)
    {
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;
        for(int i =0 ; i < n ; i++)
        {
            if(a[i] >= maxVal)
            {
                maxVal = a[i];
            }
            if(a[i] <= minVal)
            {
                minVal = a[i];
            }

        }
        return new pair(minVal,maxVal);
    }
}
