package String.MaxDiffZeroOneInBinaryString;

public class Main {

    //kadanes algo
    int maxSubstring(String S) {
        int res=0, mx=Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++)
        {
            if(res<0)
                res=0;
            if(S.charAt(i)=='0')
                res+=1;
            else
                res-=1;
            mx=Math.max(mx,res);
        }
        return mx;
    }
}

class Solution {
    int maxSubstring(String str) {
        int n = str.length();
        int current_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            // add current value to the current_sum according to the Character if it's '0' add 1 else -1
            current_sum += (str.charAt(i) == '0' ? 1 : -1);

            if (current_sum < 0)
                current_sum = 0;

            // update maximum sum
            max_sum = Math.max(current_sum, max_sum);
        }
        // return -1 if string does not contain any zero
        // that means string contains all ones otherwise max_sum
        return max_sum == 0 ? -1 : max_sum;
    }
}
