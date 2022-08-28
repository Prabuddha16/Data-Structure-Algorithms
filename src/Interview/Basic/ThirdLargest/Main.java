package Interview.Basic.ThirdLargest;

public class Main {
    int thirdLargest(int[] a, int n)
    {
        if(n<3)
            return -1;
        int f = a[0];
        int s = 0;
        int t = -1;
        for(int i=1;i<n;i++){
            if(a[i]>f){
                t = s;
                s = f;
                f = a[i];
            }
            else if(a[i]>s){
                t = s;
                s = a[i];
            }
            else if(a[i]>t){
                t = a[i];
            }
        }
        return t;
    }
}
