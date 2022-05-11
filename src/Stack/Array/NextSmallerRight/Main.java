package Stack.Array.NextSmallerRight;

import java.util.HashMap;
import java.util.Stack;

class Main {

    public static void printNSE(int[] arr, int n)
    {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        s.push(arr[0]);
        for (int i = 1; i < n; i++) {
            if (s.empty()) {
                s.push(arr[i]);
                continue;
            }
            while (!s.empty()
                    && s.peek() > arr[i]) {
                mp.put(s.peek(), arr[i]);
                s.pop();
            }
            s.push(arr[i]);
        }

        while (!s.empty()) {
            mp.put(s.peek(), -1);
            s.pop();
        }

        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ---> " + mp.get(arr[i]));
    }

    public static void main(String[] args)
    {
        int[] arr = {4,5,2,10,8};
        int n = arr.length;
        printNSE(arr, n);
    }
}

