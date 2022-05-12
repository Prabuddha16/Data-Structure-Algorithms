package Stack.Array.StackPermutations;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

class StackPermutation{

    //Method-1
    public static int isStackPermutation(int n, int[] A, int[] B) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        while(i < n){
            if(A[i] == B[j]){
                j++;
                while(!st.empty()&&B[j] == st.peek()){
                    st.pop();
                    j++;
                }
            }else{
                st.push(A[i]);
            }
            i++;
        }
        if(st.empty() && i == n && j == n){
            return 1;
        }else{
            return 0;
        }
    }

    //Method-2
    static boolean checkStackPermutation(int[] a, int[] b, int n){
        Queue<Integer> input = new LinkedList<>();

        for(int i = 0; i < n; i++){
            input.add(a[i]);
        }

        Queue<Integer> output = new LinkedList<>();
        for(int i = 0; i < n; i++){
            output.add(b[i]);
        }

        Stack<Integer> tempStack = new Stack<>();
        while(!input.isEmpty()){
            int ele = input.poll();

            if(ele == output.peek()){
                output.poll();

                while(!tempStack.isEmpty()){

                    if(Objects.equals(tempStack.peek(), output.peek())){
                        tempStack.pop();
                        output.poll();
                    }

                    else{
                        break;
                    }
                }
            }
            else{
                tempStack.push(ele);
            }
        }

        return tempStack.isEmpty();
    }

    public static void main(String[] args){

        int[] a = { 1, 2, 3 };
        int[] b = { 2, 1, 3 };
        int n = a.length;

        if(checkStackPermutation(a, b, n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        int ans = isStackPermutation(n,a,b);
        System.out.println(ans);
    }
}
