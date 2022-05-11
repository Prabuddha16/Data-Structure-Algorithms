package Stack.Array.StockSpan;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Main {
    static void calculateSpan(int[] price, int n, int[] S)
    {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        S[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    public static int[] calculate(int[] price, int n)
    {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        return res;
    }

    static void printArray(int[] arr)
    {
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }

        int[] S = new int[n];
        calculateSpan(price, n, S);

        int[] a = calculate(price,n);
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("END");

        printArray(S);
    }
}


