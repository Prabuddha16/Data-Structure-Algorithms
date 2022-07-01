package Searching._AllSearching.DFS;

import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[V];
        DFSRec(adj, 0, visited, list);
        return list;
    }

    private void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, ArrayList<Integer> list){
        visited[s] = true;
        list.add(s);
        for(int u : adj.get(s)){
            if(!visited[u]){
                DFSRec(adj, u, visited, list);
            }
        }
    }
}



class Solution {
    private void dfs(int ch, boolean[] vis, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj) {
        vis[ch] = true;
        ans.add(ch);
        for (int i = 0; i < adj.get(ch).size(); i++)
            if (!vis[adj.get(ch).get(i)])
                dfs(adj.get(ch).get(i), vis, ans, adj);
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        dfs(0, vis, ans, adj);
        return ans;
    }
}
