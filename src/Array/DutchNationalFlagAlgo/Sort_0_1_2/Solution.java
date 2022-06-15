package Array.DutchNationalFlagAlgo.Sort_0_1_2;

public class Solution
{
    public static void sort012(int[] a)
    {
        int l=0,h=a.length-1,m=0,t=0;
        while(m<=h){
            switch(a[m]){
                case 0:{
                    t=a[l];
                    a[l]=a[m];
                    a[m]=t;
                    l++;
                    m++;
                    break;
                }
                case 1:
                    m++;
                    break;
                case 2:{
                    t=a[m];
                    a[m]=a[h];
                    a[h]=t;
                    h--;
                    break;
                }
            }
        }
    }
}
