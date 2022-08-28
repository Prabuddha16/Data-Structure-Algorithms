package Interview.Basic.PalindromicArray;

public class Main {
    public static int palinArray(int[] a, int n)
    {
        int temp, count=0, sum=0;
        for(int i =0; i<a.length;i++){
            temp = a[i];
            sum = 0;
            while(temp!=0){
                sum = sum*10 + temp%10;
                temp /= 10;
            }
            if(sum == a[i])
                count++;
        }
        if(count == n)
            return 1;
        return 0;
    }
}
