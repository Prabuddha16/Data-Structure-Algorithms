package Array.Searching._AllSearching.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList <Integer> a = new ArrayList<>();
        boolean []v = new boolean [V];
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size()!=0 ){
            int u = q.poll();
            if(v[u]) continue;
            v[u]= true;
            a.add(u);
            for(int k: adj.get(u)){
                q.add(k);
            }
        }
        return a ;
    }
}
