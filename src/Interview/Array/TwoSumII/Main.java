package Interview.Array.TwoSumII;

public class Main {
    public int[] sum(int[] num, int target){
        int[] a = new int[2];
        int i=0;
        int j=num.length-1;
        while(i<j){
            if(num[i]+num[j]==target){
                a[0]=i+1;
                a[1]=j+1;
                return a;
            } else if (num[i]+num[j]>target) {
                j--;
            }else{
                i--;
            }
        }
        return a;
    }
}
