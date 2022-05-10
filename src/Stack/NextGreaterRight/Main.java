package Stack.NextGreaterRight;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static class stack {
        int top;
        int[] items = new int[100];
        void push(int x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
        }
        int pop()
        {
            if (top == -1)
            {
                System.out.println("Underflow error");
                return -1;
            }
            else {
                int element = items[top];
                top--;
                return element;
            }
        }
        boolean isEmpty()
        {
            return top == -1;
        }
    }

    //Method-1
    static void solve(int[] arr, int n)
    {
        stack s = new stack();
        s.top = -1;
        int element, next;
        s.push(arr[0]);
        for (int i = 1; i < n; i++)
        {
            next = arr[i];
            if (!s.isEmpty())
            {
                element = s.pop();
                while (element < next)
                {
                    System.out.println(element + " --> " + next);
                    if (s.isEmpty())
                        break;
                    element = s.pop();
                }
                if (element > next)
                    s.push(element);
            }
            s.push(next);
        }
        while (!s.isEmpty())
        {
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }

    //Method-2
    public static int[] nextLargerElement(int[] arr, int n)
    {
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(s.size()==0){
                s.push(-1);
                ans[i]=s.peek();
            }
            else if(s.peek()> arr[i])
            {
                ans[i]=s.peek();
            }
            else if(s.size()!=0 && s.peek()<=arr[i])
            {
                while(s.size()!=0 && s.peek()<=arr[i])
                    s.pop();
                if(s.size()==0){
                    ans[i]=-1;
                    s.push(-1);
                }else{
                    ans[i]=s.peek();
                }
            }
            s.push(arr[i]);
        }
        return ans ;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        solve(arr, n);

        System.out.println("    ********    ");

        int[] a = nextLargerElement(arr,n);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}


