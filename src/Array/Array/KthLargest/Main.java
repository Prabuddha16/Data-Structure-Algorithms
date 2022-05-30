package Array.Array.KthLargest;

import java.util.PriorityQueue;

public class Main {
    public static int kthLargest(int[] arr, int l, int r, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.offer(arr[i]);
        }

        for(int i=k; i<arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        return pq.peek();
    }
}
