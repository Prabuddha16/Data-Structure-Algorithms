package Stack.Array.MaxRectangle.MaximalRectangle;

import java.util.Scanner;


//Method-1
public class Main {
    public static int maximalRectangle(int[][] M) {
        int n = M.length;
        int m = M[0].length;
        int max = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j!=0 && M[i][j]>0)
                    M[i][j]= M[i][j-1]+1;
                int k=i;
                int min= M[i][j];
                while(k>=0 && M[k][j]>0){
                    min = Math.min(min,M[k][j]);
                    max = Math.max((i-k+1)*min,max);
                    k--;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++ )
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximalRectangle(arr));
    }
}

