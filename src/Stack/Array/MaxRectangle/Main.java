package Stack.Array.MaxRectangle;

import java.util.*;

//Method-2
class FindMinCost
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
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
            System.out.println(new Solution().maxArea(arr, n, m));
            t--;
        }
    }
}
class Solution {
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        s.push(-1);

        int max_area = arr[0];
        int[] ls = new int[n];
        int[] rs = new int[n];

        for (int i = 0; i < n; i++){
            ls[i] = -1;
            rs[i] = n;
        }

        int i = 0;
        while (i < n)
        {
            while(!s.empty() && s.peek() != -1 && arr[i] < arr[s.peek()]){
                rs[s.peek()] = (int)i;
                s.pop();
            }
            if(i>0 && arr[i] == arr[(i-1)]){
                ls[i] = ls[(int)(i-1)];
            }else{
                ls[i] = s.peek();
            }
            s.push(i);
            i++;
        }
        for(i = 0; i<n; i++){
            max_area = Math.max(max_area, arr[i]*(rs[i] - ls[i] - 1));
        }
        return max_area;
    }

    public int maxArea(int[][] M, int n, int m) {
        int[] arr = M[0];
        int MaxArea= largestRectangleArea(arr);
        for(int i=1; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                if(M[i][j]==1){
                    arr[j] += 1;
                }
                else{
                    arr[j] = 0;
                }
            }
            int ans = largestRectangleArea(arr);
            MaxArea= Math.max(ans,MaxArea);
        }
        return  MaxArea;
    }
}
