package Stack.Stack.StackUsing2Queues;

import java.util.*;

class Main {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        static int curr_size;

        Stack()
        {
            curr_size = 0;
        }

        static void push(int x)
        {
            curr_size++;
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop()
        {
            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }

        static int top()
        {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size()
        {
            return curr_size;
        }
    }

    public static void main(String[] args)
    {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        System.out.println("current size: " + Stack.size());
    }
}
