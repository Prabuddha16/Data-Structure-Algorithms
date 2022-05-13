package Queue.ImplementQueueUsingArray;

class MyQueue {

    int front;
    int rear;
    int[] arr = new int[100005];

    MyQueue()
    {
        front=0;
        rear=0;
    }

    void push(int a)
    {
        arr[rear++]=a;
        System.out.print(a+" ");
    }

    int pop()
    {

        if (front==rear)
            return -1;
        return arr[front++];
    }
}
class Main{
    public static void main(String[] args) {
        MyQueue que = new MyQueue();
        que.push(5);
        que.push(6);
        que.push(7);
        System.out.println(que.pop());
    }
}
