package Stack.CelebrityProblem;


import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int[][] M = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    }
}

class Solution
{
    int celebrity(int[][] m, int n)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1 ){
            int i=st.pop();
            int j=st.pop();
            if(m[i][j]==1){
                st.push(j);
            }
            else{
                st.push(i);
            }
        }
        int ans=st.pop();
        for(int i=0;i<n;i++){
            if(i!=ans){
                if(m[i][ans]==0 || m[ans][i]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
