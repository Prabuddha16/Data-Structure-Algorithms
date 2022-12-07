package PriorityQueue.KthLargest;

import java.util.*;
public class  Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            pq.add(a);
            if(pq.size()>k)
                pq.poll();
        }

        System.out.println(pq.poll());
    }
}
