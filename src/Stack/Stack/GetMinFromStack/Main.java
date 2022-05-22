package Stack.Stack.GetMinFromStack;

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            GfG g = new GfG();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                    //System.out.println(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }

    }
}


class GfG
{
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    int getMin()
    {
        if (s.isEmpty())
            return -1;
        return min.peek();
    }

    int pop()
    {
        if(s.isEmpty()){
            return -1;
        }
        int x = s.pop();

        if (min.peek() == x) {
            min.pop();
        }
        return x;
    }

    void push(int x)
    {
        s.push(x);

        if (min.isEmpty())
            min.push(x);
        else {
            if (x <= min.peek()) {
                min.push(x);
            }
        }
    }
}


